package org.testing;
import java.lang.Exception;

public class PracticeThrow {
	
	public static void main(String[] args) {
		String s = null;
		try {
 			System.out.println(s.indexOf(8));
		}
		
		catch (Exception e) {
			System.out.println("exception handled");
  		}
		
	}
	
	

}
