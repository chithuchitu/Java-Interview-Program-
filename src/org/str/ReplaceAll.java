package org.str;

public class ReplaceAll {
	public static void main(String [] args)
	{
		String str ="Greens technlogies122#@#end";
		String s = str.replaceAll("[^a-zA-Z0-9]", "");  
	   s.trim();
		System.out.println(s);
		
		
		
	}

}
