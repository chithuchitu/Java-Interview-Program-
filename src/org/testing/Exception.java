package org.testing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(4/2);
		System.out.println(0/5);
		System.out.println(3-9);
 		   
	
		
		//Exception types		

	//	System.out.println(5/0);// arithemtic exception
		String s= null;// null string
		String s1 = " "; // empty string
		//System.out.println(s.charAt(2));// Null pointer exception
		// null - no memeory created
 System.out.println(System.identityHashCode(s));
 String s3="null";
 System.out.println(s3.charAt(2));
// System.out.println(s3.charAt(4));// stringIndexOutof bound
 float a[]= new float[5];
 System.out.println(a[2]);
// System.out.println(a[5]);// array indexout of bound
 List<Integer> l=new ArrayList<Integer>();
 l.add(10);
 l.add(20);
 l.add(30);
 System.out.println(l.get(2));
// System.out.println(l.get(4)); Index outofbound exception
 
 Scanner sc = new Scanner(System.in);
 //System.out.println("Enter the number"); if we give string in case of num input mismatch exception occur
 //int regno = sc.nextInt();
 //System.out.println(regno); 
 
 
 String f = "123455";
 int ii = Integer.parseInt(f);
 System.out.println(ii);
  String sd = "566.78";
  float i1 = Float.parseFloat(sd);
  System.out.println(i1);
// String se = "12A";
 //int i3 = Integer.parseInt(se);
 //System.out.println(i3); number format exception
 
	}

}
