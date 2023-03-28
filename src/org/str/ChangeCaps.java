package org.str;

public class ChangeCaps {
	public static void main(String[] args)
	{
		String str = "welcome to java class";
		 String res =" "
;
		 String[] sp = str.split(" ");
		 for (String s : sp) {
			//change oth position to caps
			 char ch = s.charAt(0);
			 char up = Character.toUpperCase(ch);
			   String sub = s.substring(1);
			   res = res+up+sub+" ";
			   
			 
			 
			 
		}
		 System.out.println(res.trim());
	}
	
}
