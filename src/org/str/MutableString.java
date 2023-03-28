package org.str;

public class MutableString {
	 public static void main(String[] args) {
		System.out.println("Immutable string.....");
		String s1="java";
		String s2="java";
		System.out.println(" s1 memory "+System.identityHashCode(s1));
		System.out.println("s2 memory"+ System.identityHashCode(s2));


		s1=	s1.concat(s2);
		System.out.println(System.identityHashCode(s1));
		System.out.println("\n Mutable String..");
		StringBuffer a = new  StringBuffer("Java");
		StringBuffer b =  new StringBuffer("Java");
		StringBuffer s3 = a.append(b);
		System.out.println("a memory "+System.identityHashCode(a));
		System.out.println("b memory "+System.identityHashCode(b));
		System.out.println(System.identityHashCode(s3));


		
				
		
		 
		 
		 
		 
		 
	}

}
 