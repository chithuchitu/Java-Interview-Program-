package iptdec22.org;

public class CodeBoard {
	 public static void main(String[] args) {
		 String s ="Codeboard";
		 for (int i = 0; i < s.length(); i++) {
			  for (int j = 0; j <= i; j++) {
				  char out = s.charAt(j);
				  System.out.print(out);
				
			}
			System.out.println();
		}
	}

}
