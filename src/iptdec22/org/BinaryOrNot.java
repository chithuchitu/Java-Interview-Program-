package iptdec22.org;

import java.util.Scanner;

public class BinaryOrNot {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the number");

		int num = sc.nextInt();

		int j;
		if (num>0) {
			j= num%10;
			if (j!=0 && j !=1)
			{
				System.out.println("not binary");
			}
			else {
				System.out.println("binary");
			}
		}
	}

}
