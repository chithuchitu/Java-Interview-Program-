package org.str;

import java.util.Scanner;

public class Vowels {
public static void main (String[] args)
{
	
	int v=0,c=0;
	String vow=" ",con=" ";
	Scanner s= new Scanner(System.in);
	System.out.println("enter the letter");
	String s1 = s.next();
	for (int i = 0; i < s1.length(); i++) {
		char ch =s1.charAt(i);
		if (Character.isAlphabetic(ch)) {
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			//	v++;
				vow=vow+ch+ " ";
			}
			else
			{
		//c++;
			con= con+ch+" ";
		}
		
	}
}
	System.out.println("vowels:" +vow);
    System.out.println("consonant:"+con);
   // System.out.println("vowels count:"+v);
  //  System.out.println("consonant count:"+c);


}

}
