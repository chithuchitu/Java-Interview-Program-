package org.str;

public class PrimeONot {
public static void main(String [] args)

{
int num =13;
int val=0;
if (num<=1) {
	
	
	System.out.println("dont consider");
}
else
{
	for(int i=2; i<num/2; i++)
	{
		
		if(num% i ==0)
		{
			val=1;
			break;
		}
	}
		if (val==0) {
			System.out.println("Prime Number");
			
		}
		else {
			System.out.println("Not a Prime Number");
		}
}
	
	
}
}

