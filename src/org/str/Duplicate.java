package org.str;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class Duplicate {
	public static void main (String [] args)
	{
		List<Integer> l= Arrays.asList(10,20,50,30,70,60,20,10,50);
		System.out.println(l);
		Set<Integer> s= new LinkedHashSet<>();
		s.addAll(l);
		System.out.println(s);
		Integer maxValue = java.util.Collections.max(l);
		Integer minValue = java.util.Collections.min(l);
		System.out.println("Maximum Value:" +maxValue);
		 System.out.println("Minimum vlaue:" + minValue);
		
		
		
		
	}
	
	
	

}
