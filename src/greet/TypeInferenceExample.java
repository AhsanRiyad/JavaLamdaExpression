package greet;

public class TypeInferenceExample {

	public static void main(String[] args) {
		//it can assume type from the interface
		/*
		 * StringLenghtLamda myLamda = s -> s.length();
		 * System.out.println(myLamda.getLength("hwllow world"));
		 */
		
		printLamda(s->s.length());
//		printLamda(s->2);
		
	}

	public static void printLamda(StringLenghtLamda l) {
		System.out.println( l.getLength("hellow world") );
	}
	
	public interface StringLenghtLamda{
		int getLength(String s);
	}
	
	
	
}
