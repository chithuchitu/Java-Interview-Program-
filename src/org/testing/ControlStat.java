package org.testing;

import java.util.Scanner;

public class ControlStat {
	public static void main(String[] args) {
		// *** if statement *** /// condition true block will executed

		//		  int a=12,b=5;
		//		   int c= a+b;
		//		   
		//		 
		//		  if (c>10) {
		//			  System.out.println("allowed");
		//			//=====================================================================  
		//			
		//		}
		//*** if - else statement****//// condition true if block executed otherwise else block will execute

		//		 Scanner s = new Scanner(System.in);
		//		 System.out.println("Enter age:");
		//		 int age = s.nextInt();
		//		 if (age>=18) {
		//			 System.out.println("Eligible to Vote");
		//			
		//		}
		//		
		//		 else
		//		 {
		//			 System.out.println("Not Eligible to Vote");
		//		 }
		//Note
		//======================================================================
		//logical operator
		//&& AND  both condition will satisfy-- all condition will true
		//|| OR any one of the condition wil satisfy it will be true

//				 Scanner s = new Scanner(System.in);
//				 System.out.println("Enter emp id");
//				 int empId = s.nextInt();
//				 System.out.println("Enter Dept No:");
//				 int deptNo = s.nextInt();
//				 
//				 if (empId>100 && deptNo==1) {
//					 System.out.println("employyee from TCS- Testing");
//					
//				}
//				  
//				 else {
//					 System.out.println("employee undefined");
//					
//				 }
				 
		//==================================================================== 
//else if ladder-
//Scanner s = new Scanner (System.in);
// System.out.println("Enter A  Value:");
// int a = s.nextInt();
// System.out.println("enter B  value:");
// int b = s.nextInt();
// System.out.println("Enter C Value:");
// int c = s.nextInt();
//
// if (a> b && a>c) {
//	 
//	 System.out.println("A is Greater..");
//	 
//}
//
// else if (b>a && b>c) {
//	 System.out.println("B is Greater...");
//	
//} else {
//	System.out.println("C is Greater..");
//
//}
 // nested if
 //============================================
 Scanner s = new Scanner(System.in);
 System.out.println("Enter emp id");
 int empId = s.nextInt();
 System.out.println("Enter Dept No:");
 int deptNo = s.nextInt();
 
 if (empId>100) {// if this bock will true go for inner if condtion,if this fails directly go to the final else
	 
	 if (deptNo==1) {
		 System.out.println("TcS Employee= Other Department");
		
	}
	 else
	 {
		 System.out.println("Employee from other dept");
	 }
	 
 
	
}
  
 else {
	 System.out.println("employee undefined");
	
 }
			 
	}

}
