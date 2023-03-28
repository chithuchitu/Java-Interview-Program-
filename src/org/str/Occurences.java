package org.str;

public class Occurences {
	public static void main (String [] args)
	{
		
		String s="GreensTechEmp";
		int countE=0,countN=0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch=='e'|| ch=='E') {
				countE++;		
			}
			else if (ch=='n'||ch=='N') {
				countN++;
				
			}
		}
		
		
		System.out.println("no of E :"+countE);
		System.out.println("no of N:"+countN);
	}

}
