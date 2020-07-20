package greet;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExcerciseSolutionJava7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Persons> People = Arrays.asList(
				new Persons("ahsan" , "ferdous", 35),
				new Persons("ahsan" , "ferdous", 28),
				new Persons("ahsan" , "Citara", 28)
				);
		
		//step 2
		//print all
		printAll(People);
		
		
		//step 1
		//sort list by last name
		Collections.sort(People, new Comparator<Persons>() {

			@Override
			public int compare(Persons o1, Persons o2) {
				// TODO Auto-generated method stub
				return o1.getLastName().compareTo(o2.getLastName());
			}
			
		});
		
		
		//step 3
		printLastNameBeginWithC(People);
		
	}

	
	private static void printLastNameBeginWithC(List<Persons> People) {
		for( Persons P: People ) {
			if( P.getLastName().startsWith("C") ) {
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
