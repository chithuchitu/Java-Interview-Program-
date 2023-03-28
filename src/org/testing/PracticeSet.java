package org.testing;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class PracticeSet {

	public static void main(String[] args) {
		//set  value based
		Set<Integer> s = new HashSet<>();
		s.add(10);
		s.add(80);
		s.add(30);
		s.add(20);
		s.add(40);
		s.add(50);
		s.add(20);
		s.add(20);
		System.out.println(s);
		
	//To check particular values present or not
		boolean contains = s.contains(20);
		System.out.println("If set contains 30 or not:"+contains);
	//To remove value from set
	s.remove(20);
		System.out.println(s);
		//To check sety is empty or not
		boolean a = s.isEmpty();
		s.clear();
System.out.println("Now values in set"+s);
		boolean empty = s.isEmpty();

		if (empty==true) {
			System.out.println("Set is empty");
		}
		else
		{
			System.out.println("Set is not empty");
		}
		
		
		s.add(10);
		s.add(20);
		s.add(40);
 		s.add(50);
		System.out.println(s);
		// Iterate Set - Only Enhanced loop
		// Normal for loop  index based
		// enhanced loop - Value based
		for (Integer x : s) {
			System.out.println(x);
			
		}
		
		
		
		
		
		
 	}

}
