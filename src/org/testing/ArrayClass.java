package org.testing;

public class ArrayClass {
	public static void main(String[] args) {
		
	//Array declaration
	int[] a = new int[5];
	
	//intialization
	
	a[0]=40;
	a[1]=20;
	a[2]=30;
	a[3]=20;
	a[4]=60;
	//Fetch particular index position
		System.out.println(a[2]);
		// to find no of elements in array
		System.out.println("Number of lements in array " +a.length);
				
		//iterate values from array.. array index ranges from  0 to length-1
		//Index based for loop
		System.out.println("Normal for loop =- index based");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
		// enhanced for loop
		       // Datatype  new vat : array
		System.out.println("Enhanced for loop - values based");
			for (int j : a) {
				System.out.println(j);
				
			}

}
}