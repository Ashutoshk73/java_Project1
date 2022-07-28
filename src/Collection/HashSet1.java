package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		
			HashSet hSet = new HashSet();  // no insertion order 
			
			hSet.add("Mumbai");
	
			hSet.add("Dilhi");
			hSet.add("Nagpur");
			hSet.add("Pune");
			System.out.println(hSet);
			
			for(Object k : hSet)   // for each loop
			{
				System.out.println(k+" City");
			}
			
			
			System.out.println("=============================================");
			
			
		  	ArrayList list = new ArrayList(hSet);  // sorting by converting set in to list
		  	
		  	Collections.sort(list);
		  	System.out.println(list);

	}

}
