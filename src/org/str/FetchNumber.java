package org.str;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class FetchNumber {
	public static void main(String [] args) 
	
	{
		//
		List<Integer> li = Arrays.asList(20,30,30,10,50,90,90,90,90,40,80);
		//List<String> li = Arrays.asList("ram,sita,ragu,ram.ram,ragu,ragu,sita,kavi");
		Map<Integer, Integer> m = new LinkedHashMap<>();
		
		// Iterate List
		for (Integer x : li) {
			  if(m.containsKey(x))
			  {
				  Integer count = m.get(x);
				  m.put(x, count+1);
			  }
			  else
			  {
				  m.put(x, 1);
			  }
			
		}
		
		Set<Entry<Integer,Integer>> allEnteries = m.entrySet();
		for (Entry<Integer,Integer> eachEntry : allEnteries) {
			if(eachEntry.getValue()>2)
			{
				System.out.println( eachEntry.getKey() +" " + "Occurred" + eachEntry.getValue()+"times");
			}
			
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	}

