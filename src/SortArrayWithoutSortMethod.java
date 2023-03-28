import java.util.Set;
import java.util.TreeSet;

public class SortArrayWithoutSortMethod {
	public static void main (String [] args)
	{
		
		
		int a[]= { 30,10,60,10,50};
		System.out.println("Sorting Array without sort () Method");
		// Sort Array  without predefined method 
		for (int i = 0; i < a.length; i++) {
			 for (int j = i+1; j < a.length; j++) {
				 if (a[i] >a[j]) {
					 int c = a[i];
					 a[i]=a[j];
					 a[j]=c;
					 									}
							}
							 		}
		
		 for (int x : a) {
			 System.out.println(x);
			
		}
		 System.out.println("After duplicate  Removal");
		 Set<Integer> s = new TreeSet<>();
		 for (Integer val : a) {
			s.add(val);
			}
		 System.out.println(s);
	}
 
}
