package greet;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1ExcerciseSolutionJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Persons> People = Arrays.asList(
				new Persons("ahsan" , "ferdous", 35),
				new Persons("ahsan" , "ferdous", 28),
				new Persons("ahsan" , "Citara", 28)
				);
		
		//step 2
		//print all
		System.out.println("Printing all person");
		printAll(People);
		
		
		//step 1
		//sort list by last name
		Collections.sort(People, (P1,P2)-> P1.getLastName().compareTo(P2.getLastName()) );
		
		
		//step 3
		System.out.println("Printing conditionally");
		performConditionally(People, p -> p.getLastName().startsWith("C"), p -> System.out.println('p' ) );
		
	}

	//java.util.function=> Predicate just has a funtion and it return a boolean,
	// and the calling method also returns a boolean
	private static void performConditionally(List<Persons> People, Predicate<Persons> condition , Consumer<Persons> consumer) {
		for( Persons P: People ) {
			if( condition.test(P) ) {
				consumer.accept(P);
			}
		}
		
	}
	
	private static void printAll(List<Persons> People) {
		for(Persons p: People) {
			System.out.println(p);
		}
	}
	
	
}
