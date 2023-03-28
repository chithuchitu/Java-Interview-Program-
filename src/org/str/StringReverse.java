package org.str;

public class StringReverse {
	public static void main(String[] args)
	{
		String s = "WelcometoJava";
		String rev =" ";
		for (int i = s.length()-1; i >=0; i--) {
			char ch = s.charAt(i);
			rev= rev+ch;
				
		}
		System.out.println("After reverse string....");
		System.out.println(rev);	
	}
	
	
}
