package org.str;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateRemovalChar {
	public static void main (String [] args)
	{
		
		String str ="Greens Technology Tamabaram";
		Set<Character> s = new LinkedHashSet<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			s.add(ch);
					}
		
		System.out.println(s);
	}

}
