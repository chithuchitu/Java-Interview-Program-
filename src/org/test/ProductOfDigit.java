package org.test;

public class ProductOfDigit {
	public static void main(String[] args)
	{
		
		int num =523;
		int res=1,rem=0,no=num;
		while(num>0)
		{
			rem = num%10;
			res= res* rem;
			num= num/10;
			
		}
		
		System.out.println("Given No " +no);
		System.out.println("Product of Digits " +res);
	}
	
	

}
