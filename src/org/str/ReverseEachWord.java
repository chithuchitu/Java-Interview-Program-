package org.str;

public class ReverseEachWord {
	public static void main(String[] args)
	{
	 String str ="welcome to java";
	 String res=" ";
	 String rev= " ";
	         String[] words = str.split(" ");
	 for(String word : words)
	{
	for(int i= word.length()-1; i>=0;i--)
	{

	char ch = word.charAt(i);
	rev= rev+ch;


	}

	res = rev +" ";
	
	}

	 System.out.println(res.trim());
	}
	 
	 
}
