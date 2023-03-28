package org.testing;

import java.lang.Exception;

public class Edetails {

	public static void main(String[] args) {
		// Handling Exception
		System.out.println("Exception Handling");
		System.out.println("===================");
		try {
			String s = null;
			System.out.println(s.charAt(3));
			System.out.println(4/0);		
		}
		catch (ArithmeticException e) { 
			System.out.println("not d");
		}
		catch (Exception e) {
			System.out.println("exception handled");
		}
		finally {
			System.out.println("finally ");
		}
	}

}
