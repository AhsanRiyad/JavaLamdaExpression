package Unit2;

import java.util.function.BiConsumer;

public class ExceptionHandingInWarapeerLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numbers = {1 ,2 ,3 ,4 ,5};
		int key = 2;
		
		process( numbers , key , wrapperLamda( (v , k) ->  System.out.println( v/ k )  ) );
	}

	private static void process(int [] numbers , int key ,  BiConsumer < Integer, Integer > consumer  ) {
		for( int i: numbers  ) {
			consumer.accept(i, key);
		}
	}

	
	public static BiConsumer<Integer, Integer> wrapperLamda(BiConsumer<Integer, Integer> consumer){
		//return a lamda
		return (v,k)->{
			try {
				consumer.accept(v, k);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Exception occurs");
			}
		};
	}
	
	
}
