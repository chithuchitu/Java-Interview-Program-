package iptdec22.org;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class SortArray {

	public static void main(String[] args) {
  /* List<Integer> l = new ArrayList<>();
   l.add(80);
   l.add(60);
   l.add(20);
   l.add(70);
   l.add(10);
   l.add(10);
   l.add(20);
  System.out.println(l);*/
  // To remove duplicates we use set
   // For Insertion Order we use Tree Set
 Set<Integer> s = new TreeSet<>();
// s.addAll(l);
 s.add(10);
 s.add(90);
 s.add(30);
 s.add(80);
 s.add(10);
 s.add(20);
 s.add(50);
 s.add(60);
 System.out.println(s);
 

 
 	}

}
