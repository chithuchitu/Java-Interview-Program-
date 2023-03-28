package org.str;

import java.util.*;

public class Map {
	
	public static void main(String[] args)
	{
		 int a[] = {10,20,40,20,50,30,10};
		 java.util.Map<Integer, Integer> m= new LinkedHashMap<>();
		 for (int x : a) {
			 if (m.containsKey(x)) {
				 Integer count = m.get(x);
				 m.put(x, count+1);
				 				
			}
			 else
				 m.put(x, 1);
			
		}
		 	System.out.println(m);
			}

}
