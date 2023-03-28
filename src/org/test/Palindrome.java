package org.test;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		 System.out.println("Enter a number");
		int num = s.nextInt();
		
		 int res=0,rem=0,no=num;
		 while(num>0)
		 {
			 rem = num%10;
			 res=(res*10)+rem;
			 num=num/10;
			 }
		 System.out.println("Given number before revers"+ no);
		 System.out.println("Given number after reverse"+res);
		  if(no==res)
		  {
			  System.out.println("Given number is palindrome");
			  
		  }
		  else
		  {
			  System.out.println("Given number is not palindrome");
			  
		  }
		  
		
	}

}
