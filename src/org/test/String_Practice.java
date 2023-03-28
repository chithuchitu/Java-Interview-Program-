package org.test;

public class String_Practice {

	public static void main(String[] args) {

		String s ="  New Program  class  java  ";
		//Find length
		int len = s.length();
		System.out.println("length of given string:"+len);
		System.out.println(s.length());	
		// To UpperCase and lower case
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		// Starts sequence
		boolean a = s.startsWith("Ne");
		System.out.println(a);
		//End Sequence
		boolean b = s.endsWith("gram");
		System.out.println(b);
		// check particular sequence present or not
		boolean c = s.contains("rog");
		System.out.println(c);
		// to fetch particular portion
		String d = s.substring(10);
		System.out.println( "substring "+ d);
		String e = s.substring(1, 12);
		System.out.println( "substring "+e);
		// fetch particular letter by pass index
		//char f = s.charAt(25);
		//System.out.println(f);
		// to fetch index position
		int g = s.indexOf('m');
		System.out.println(g);
		int h = s.indexOf('z');
		System.out.println(h);
		int i = s.indexOf('c');
		System.out.println(i);
		int j = s.indexOf("java");
		System.out.println(j);
		int k = s.lastIndexOf('m');
		System.out.println(k);
		String l = s.replace('m','*');
		System.out.println(l);
		String m = s.replace("java", "selenium");
		System.out.println(m);
		System.out.println(m.length());
		//String is only having "" --> empty string
		String str="";
		boolean n = str.isEmpty();
		System.out.println(n);
		if (s.isEmpty()) {
			System.out.println("string empty");
		}
		else
		{
			System.out.println("string not empty");
		}	 
		String o = s.trim();
		System.out.println(o); 
		String s1="WELCOME";
		String s2="welCome";
		boolean p = s1.equals(s2);
		System.out.println(p);
		boolean r = s1.equalsIgnoreCase(s2);
		System.out.println(r);
		//Join two strings
		String s3 = s1.concat(s2);
		System.out.println(s3);
		int s4 = s1.compareTo(s2);
		System.out.println(s4);
		String s5 ="Wel";
		int ss = s2.compareTo(s5);
		System.out.println(ss); 
		String st = "strun123";
		int hashCode = st.hashCode();
		System.out.println(hashCode);
		System.out.println(System.identityHashCode(st));
		String sl= "Java class Java class java";
		String replaceAll = sl.replaceAll("Java", "Python");
		System.out.println(replaceAll);
		String replaceFirst = sl.replaceFirst("Java", "python");
		System.out.println(replaceFirst);

		String[] split = s3.split("");
		System.out.println(split);











	}




}
