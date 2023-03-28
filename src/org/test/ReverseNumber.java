package org.test;

import java.util.Scanner;

public class ReverseNumber {
	 public static void main(String[] args)
	 {
		 
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter a Number");
		 int num = s.nextInt();
		 int rem=0,res=0,no=num;
		 while(num>0)
		 {
			 rem = num % 10;
			  res= (res*10)+rem;
			  num = num /10;
			 
			 
		 }
		  System.out.println("Before Reverse"+no);
		  System.out.println("After Revers:"+res);
		  
		  
		 
		 
		 
	 }
	 

}
