package org.str;

public class Armstrong {
	public static void main(String [] args)
	{
		int num = 1634, n = num;
		 int power =0, rem =0, res =0;
		while (num>0) {
			num=num/10;
			power++;
					}
		num =n;
		while(num>0)
		{
		rem = num% 10;
		res=(int)(res+Math.pow(rem, power));
		num=num/10;
					
		}
		if(n==res)
		{
			
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not a Armstring");
		}
}
		
		
}