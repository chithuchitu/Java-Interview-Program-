package org.str;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class StringReverseInNumbers {
	public static void main(String[] args) {
		StringBuilder inputVal= new StringBuilder();
		StringBuilder outputVal= new StringBuilder();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Input String:");
		inputVal.append(s.next());
		
	//	inputVal.append("123alpha123beta");
		int length = inputVal.length();
		for (int i = length-1; i >=0; i--) {
			
			if (Character.isDigit(inputVal.charAt(i))) {
				for (int j = i; j >=0; j--) {
					if (!Character.isDigit(inputVal.charAt(j))) {
						outputVal.append(inputVal.substring(j+1, i+1));
						i=j+1;
						break;						
					}
					else if (j==0) {
						outputVal.append(inputVal.substring(j, i+1));
						i=j-1;
						break;
					}
				}
			}
				else {
					for (int j = i; j >=0; j--) {
						
						if (Character.isDigit(inputVal.charAt(j))) {
							String str = inputVal.substring(j+1, i+1);
							outputVal.append(StringUtils.reverse(str));
							i=j+1;
							break;						
						}
						else if (j==0) {
							String str = inputVal.substring(j, i+1);
							outputVal.append(StringUtils.reverse(str));
							i=j-1;
							break;
						}
					}
					
				}
				
			}
			System.out.println(outputVal);
		}
		

}
