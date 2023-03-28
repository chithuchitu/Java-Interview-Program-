package org.str;

import java.util.Scanner;

public class Palindrome {
	public static void main(String [] args)

	{
		 System.out.println("Enter a  String");
		 
		 Scanner sc = new Scanner(System.in);
		 String s = sc.next();
		
		
		String r = "";
		for(int i =s.length()-1;i>=0;i--)
		{
			char ch = s.charAt(i);
			r = r+ch;
			
		}
		System.out.println("Given String:" +s);
		System.out.println("Reverse String:" +r);
		if (s.equalsIgnoreCase(r)) {
			System.out.println("Palindrome");
			
		}
		else {
			System.out.println("not palindrome");
		}
	}
}
