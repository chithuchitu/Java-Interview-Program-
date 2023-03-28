package org.str;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumAndMaximum {
	public static void main (String [] args)
	{
		List<Integer> l = Arrays.asList(10,30,50,20,60,30,20,10,40,50,100,-10);
		System.out.println(l);
		// Sorting using Sort() Method
		Collections.sort(l);
		System.out.println(l);
//		System.out.println("Min Value:"+l.get(0));
//		System.out.println("Max Value:"+l.get(l.size()-1));
		// Or Another Method to find max & Min Collections
		System.out.println(" MAximum & Minimum Value Using Collections");
		System.out.println("Minimum Value:" + Collections.min(l));
		System.out.println("Maximum Value:"+   Collections.max(l));
		
		
	}

}
