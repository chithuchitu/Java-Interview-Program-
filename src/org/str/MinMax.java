package org.str;

import java.util.Arrays;

public class MinMax {


	public static void main(String [] args)
	{
		int ar[]= {20,50,30,40,10,20,90,50,80,60,50};
		System.out.println("After Sorting..");
		Arrays.sort(ar);
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		System.out.println("Min value:" +ar[0]);
		System.out.println("Max Value:" +ar[ar.length-1]);
		System.out.println("Second Min and Max Value");
		System.out.println("Min Value" +ar[1]);
		System.out.println("Max Value"+ar[ar.length-2]);





	}



}
