package org.str;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicatesRemovalWord {
	 public static void main(String [] args)
	 
	 {
		 
		 String str ="Good day Bad day  slap sing slap Good day Bad day";
		 String [] sp = str.split(" ");
		 Set<String> s = new LinkedHashSet<>();
		 //Iterate Array
		  for (String word : sp) {
			  s.add(word);		
		}
		  System.out.println(s);
	 }

}
