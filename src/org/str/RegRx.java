package org.str;

public class RegRx {
	public static void main(String[] args)

	{
	  String str = "Hai Welcome to Java Class @ porur ";
	   System.out.println(str);
		//  \\s ->space
	   String res = str.replaceAll("\\s", "*");
		System.out.println(res);
		String res3 = str.replaceAll("[^a-z]", "*");
		System.out.println(res3);
		String res1 = str.replaceAll("[a-z]","*");
		System.out.println(res1);
		String res2 = str.replaceAll("[A-Z]", "*");
		System.out.println(res2);
		String res4 = str.replaceAll("[A-Z a-z 0 - 9]", "*");
		System.out.println(res4);
		
		
		
		
		
		
		
		
}
	
	
	
	
	
	
	
	
	
}
