package org.str;

import java.util.Arrays;

public class Anagram {
	 public static void main(String [] args)

	 {
		 String s1=" abcd";
		 String s2=" becd";
		 if (s1.length()==s2.length()) {
			 
		char[]c1=	 s1.toCharArray();
		char []c2= s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		boolean res = Arrays.equals(c1, c2);
		if (res) {
			System.out.println("Anagram");
			
		}
		else
		{
			System.out.println("Not an Anagram");
		}
			
		}
		 
	 }
}
