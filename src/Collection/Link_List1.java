package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Link_List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();
		
		list.add(10);
		list.add("Velocity");
		list.add(20);
		list.add("pune");
		
		System.out.println(list);
		
		
		for(Object k: list)
		{
			System.out.println(k+ "Ak");
		}
		
		Iterator it = list.iterator();
		
		while (it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
