package org.str;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {
	public static void main (String [] args)
	{
		
		int ar[]= {10,40,20,10,30,30,30,40,50,60,50,90,80};
		
		// Set Won't allow duplicates
		Set<Integer> s= new TreeSet<>();
	 
		  for (int x : ar) {
			  
			s.add(x);
		}
		
		  System.out.println(s);
	}
	   
	
	

}
