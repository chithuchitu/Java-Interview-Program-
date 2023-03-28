package org.str;

import java.util.*;




public class OccurencesMap {
	public static void main(String[] args)
	{
		String s ="Greens Technoligies End";
		 java.util.Map<Character, Integer> m= new LinkedHashMap<>();
		 for (int i = 0; i < s.length(); i++) {
			 char ch = s.charAt(i);
			 if (m.containsKey(ch)) {
				 Integer count = m.get(ch);
				 m.put(ch, count +1);
							
			}
			 else {
				m.put(ch, 1);
							}
			
		}
		 System.out.println(m);
		 
	}

}
