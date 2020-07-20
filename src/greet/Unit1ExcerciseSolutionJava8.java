package greet;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
		printConditionally(People, p -> p.getLastName().startsWith("C"));
		
	}

	
	private static void printConditionally(List<Persons> People, Condition condition) {
		for( Persons P: People ) {
			if( condition.test(P) ) {
				System.out.println(P);
			}
		}
		
	}
	
	
	private static void printAll(List<Persons> People) {
		for(Persons p: People) {
			System.out.println(p);
		}
	}
	
	
}
