package org.testing;

import java.util.LinkedList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		// genereics Wraapper class for similar datatypes within<>
		List<Integer> li = new LinkedList<Integer>();
		li.add(10);// 0
		li.add(10);// 1
		li.add(10);// 2
		li.add(null);// 3
		li.add(50);// 4
		li.add(70);// 5
		li.add(null);// 6
		System.out.println(li);
		System.out.println("Number of elements in list:" + li.size());

		// to find the last index in list

		System.out.println("Last index in list:" + (li.size() - 1));

		// to get particular index position
		Integer x = li.get(4);
		System.out.println("Element of  4 th index" + x);

		// Iterate all the elements from list
		System.out.println(" Elements iterate using normal for loop");
		for (int i = 0; i < li.size(); i++) {
			Integer e = li.get(i);
			System.out.println(e);
		}
		System.out.println("Iterate using enhanced for loop");
		for (Integer s : li) {
			System.out.println(s);

		}
		// to get  index of last occur
		int indexOf = li.indexOf(70);
		System.out.println(" the index position of eement 70 is:" +indexOf);
		// to check the element is  empty or not
	System.out.println(" Check the element is empty or not:" +li.isEmpty());
	Integer rem = li.remove(4);
	System.out.println ("the removed element is" +rem);
 System.out.println(li);
 System.out.println("To replace the  element present in particular position" );
  li.set(2, 40);
 System.out.println(li);
 List<Integer> l= new LinkedList<Integer>();
 l.add(90);
 l.add(10);
 l.add(70);
 l.retainAll(li);
 System.out.println(l);
 System.out.println("to check  element present in list   or not");
 boolean equals = li.equals(l);
 System.out.println(equals);
 System.out.println("to chech  element present in list  is equal  or not");
 boolean contains = li.contains(null);
 System.out.println(contains);
 
 
 
 
 	}

	
	
	
	
	

}
