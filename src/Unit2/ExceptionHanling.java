package Unit2;

import java.util.function.BiConsumer;

public class ExceptionHanling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numbers = {1 ,2 ,3 ,4 ,5};
		int key = 2;
		
		process( numbers , key , (v , k) -> {
			try {
				System.out.println( v/ k );
			} catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println("Arithmatice exception");
				
			}
		} );
	}

	private static void process(int [] numbers , int key ,  BiConsumer < Integer, Integer > consumer) {
		for( int i: numbers  ) {
			consumer.accept(i, key);
		}
	}
	
}
