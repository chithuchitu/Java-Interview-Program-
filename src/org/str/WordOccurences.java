package org.str;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordOccurences {
	public static void main(String [] args)
	{
		String ar[]= {"abi","Ram","Anu","Abi","Anu","Ram","Vikas","Kavi","Kavi"};
		Map<String,Integer> m = new LinkedHashMap<>();
		for (String name : ar) {
			if (m.containsKey(name)) {
				Integer count = m.get(name);
				m.put(name, count+1);
										
			}
			else
			{
				m.put(name, 1);
			}
	
		}
		System.out.println(m); 
	}

}
