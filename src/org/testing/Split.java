package org.testing;

public class Split {
public static void main(String[] args) {
	String s= " java program class";
	String[] sp = s.split(" ");
 for (int i = 0; i < sp.length; i++) {
	 System.out.println(sp[i]);
	
}
  for (String spl : sp) {
	  System.out.println(spl);
	  
	
}
}
}
