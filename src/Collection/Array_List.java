package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Array_List {

	public static void main(String[] args) {
	
		ArrayList<Integer> list =new ArrayList<>();    //  generic

		list.add(20);
		list.add(10);
		list.add(40);
		list.add(30);
		list.add(50);
	
		
		
		System.out.println(list);
		System.out.println(list.size());  // size of Array list
		
		System.out.println(list.get(0));  // getting data of perticular index
		System.out.println(list.get(1));
		System.out.println(list);

		
		list.set(1, 60);  // using set method 
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);  // (sorting in assending order) collection is class of java.until
		
		Collections.reverse(list);
		System.out.println(list);  // riversing the list
		
		
		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("Ashutosh");
		list1.add("Kurulekar");
		list1.add("Kandhar");
		
		System.out.println(list1);
		
		
		Collections.sort(list1);
		System.out.println(list1);
		
		Collections.reverse(list1);  
		System.out.println(list1);
		
		// checking the data is preasent or not ( in true or false)
		System.out.println(list1.isEmpty());
		
		list1.clear();   // deleating the data
		System.out.println(list1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
