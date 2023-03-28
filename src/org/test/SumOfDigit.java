package org.test;

public class SumOfDigit {
	public static void main(String[] args)
	{
		int num =70258;
		int rem=0,res=0,no=num;
		while(num>0)
		{
			rem= num % 10;
			res= res + rem;
			num =num/10;
			
		}
		System.out.println("Given Number"+no);
		System.out.println("Sum of Digits" +res);
	}

}
