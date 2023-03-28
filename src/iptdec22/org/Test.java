package iptdec22.org;

public class Test {
	
	public static void main(String[] args) {
		String s =" Iam a Java Developer";
		 String reverse =" ";

		String[] word = s.split(" ");
		for (int i = word.length-1 ; i >=0; i--) {
			reverse = word[i] + reverse +" " ;
			
			
		}
		 
	
System.out.println(reverse);
		
	}

}
