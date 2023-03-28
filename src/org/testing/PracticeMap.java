package org.testing;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class PracticeMap {

	public static void main(String[] args) {
 
 	
		Map<Integer,String> mp = new TreeMap<>();
		 // to  insert dtas in set use put()
		//key - dont allow duplictes
		// value allow duplicates
		
		mp.put(10, "java0");
		mp.put(20,"sql");
		mp.put(30, "python");
		mp.put(40,"java");
		mp.put(50,"manual");
		mp.put(60, "java");
		mp.put(20, ".net");
		 System.out.println(mp);
		  // to check particular key present or not
		 boolean a = mp.containsKey(20);
		System.out.println(a);
		System.out.println(a);
		boolean b = mp.containsValue("sql");
		System.out.println(b);
		// to remove particular value ex 10 ->>keyis value will remove
		mp.remove(10);
		System.out.println(mp);
		 
		// To fetching  value by passing inder by get key
		 String c = mp.get(30);
		 System.out.println(c);
		String d = mp.get(90);
		System.out.println(d);
		// to find the size of map
		int e = mp.size();
		System.out.println("the size of map "+ e  );
		//to fetch only keys
		Set<Integer> f = mp.keySet();
		System.out.println("the keys are" +f);
		for (Integer x : f) {
			System.out.println(x);
			
					}
		//to fetch only values
		Collection<String> l = mp.values();
		System.out.println("The values are" + l);
		 //iterate only values
		for (String y : l) {
			System.out.println(y);
			
		}
		
		// to entire map- we cant iterate map directly so use iterate map
		Set<Entry<Integer, String>> en = mp.entrySet();
		System.out.println(en);
		
for (Entry<Integer, String> m : en) {
	System.out.println(m.getKey());
	System.out.println(m.getValue());
}		
		
		
		
		
	}
	
	
	
	

}
