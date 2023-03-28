package org.testing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {

	public static void main(String[] args) {

		List<Integer> s = new ArrayList<Integer>();
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(20);
		s.add(10);
		s.add(60);
		s.add(70);
		s.add(10);
		s.add(40);
		System.out.println("given list" + s);

		// Set Declare
		Set<Integer> s1 = new TreeSet<>();
		// addAll -To copy all values from 1 interface (List) another interface(Set)
		// RetainALl = print common values for
		// Removeall - Remove common value between two interface
		// equals -  to compare two interface
		s1.addAll(s);
		System.out.println("\n After remove duplicates:\n"+s1);
		System.out.println("\n To count duplicates: \n" + (s.size()-s1.size()));
		
		
	}

}
