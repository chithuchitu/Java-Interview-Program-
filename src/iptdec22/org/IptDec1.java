package iptdec22.org;

public class IptDec1 {
	//* main method
	 static
	 {
		 System.out.println("hello");
	 }
	  public static void main()
	  {
		  System.out.println("Main Overloaded");
	  }
	  
	  public static void main(String name)
	  {
		  System.out.println(name);
	  }
	 public static void main(String[] args) {
		 System.out.println("welcome...");
		 main();
		 main("chithra");
		
	}


}
