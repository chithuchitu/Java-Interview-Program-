package org.str;

public class UpperLowerCase {
	public static void main(String[] args)
	{
		String str ="GreensTech@123#";
		int up=0,low=0,num=0,spl=0;
		String upper =" ",lower=" ",numb="",spec=" ";
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if (Character.isUpperCase(ch)) {
				up++;
				upper= upper+ch+" ";
					}
			else if (Character.isLowerCase(ch)) {
				low++;
				lower= lower+ch+" ";
				
			}
			else if (Character.isDigit(ch)) {
				num++;
				numb=numb+ch+" ";
								
			}
			else {
				spl++;
				spec= spec + ch +" ";
			}
		}
		
		
		System.out.println("uppercase:"+upper +"Count:" +up);
		System.out.println("Lowercase:"+lower + "count:"+low);
		System.out.println("Numbers:"+numb +"Count:"+num);
		System.out.println("Special Characters:"+ spec + "Count:" + spl);
	}
}
