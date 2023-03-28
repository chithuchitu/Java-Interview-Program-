package org.str;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountNoOfWords {
	public static void main (String [] args)
	{
		String str="Ram,Sam,Abi.Ram,Ram,Sam,Abi,Sam";
		
		Map<String,Integer> m = new LinkedHashMap<>();

		String[] allWords = str.split(" ");
		for (String name : allWords) {
			
			if (m.containsKey(name)) {
				Integer count = m.get(name);
				m.put(name, count+1);
				
			}
			else {
				m.put(name, 1);
			}
		}
		System.out.println(m);
	}

}
