package org.testing;

 
import java.util.LinkedList;
 

public class List {
	
	public static void main(String[] args) {
	  LinkedList li = new LinkedList();
	  li.add(10);
	  li.add("Java");
	  li.add(10002121l);
	  li.add(true);
	  li.add(10);
	  li.add(null);
	  System.out.println(li);
	  // to find no of elements in list
	  
	  System.out.println("Number of elements in list:"+li.size());
	  	 // to find the last index in list
	  
	  System.out.println("Last index in list:" +(li.size()-1));
	  
	  
	  
		
	 
		
	}
	
	

}
 