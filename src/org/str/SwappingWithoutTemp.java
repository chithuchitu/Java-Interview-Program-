package org.str;

public class SwappingWithoutTemp {
	public static void main(String [] args)
	{
		String s1="chithra";
		String s2 ="Pavai";
		s1= s1+s2;
		//now s1 value
		System.out.println("Now s1 have:"   +s1);
		s2=s1.substring(0,s1.length()-s2.length());
		s1= s1.substring(s2.length());
		
		System.out.println("s1:" +s1);
		System.out.println("s2:" +s2);
		
	}

}
