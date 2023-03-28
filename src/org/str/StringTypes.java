package org.str;

public class StringTypes {
	
	 public static void main(String[] args) {
		 
		 System.out.println("Literal String......");
		 String s1= "java";
		 String s2="java";
		 System.out.println(System.identityHashCode(s1));
		 System.out.println(System.identityHashCode(s2));
		 String s3="Python";
		 System.out.println(System.identityHashCode(s3));
		 
		System.out.println("Non Literal String...."); 
		String a= new String("java");
		String b= new String("java");
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		 
		
	}

}
