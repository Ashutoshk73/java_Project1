package Collection;

import java.util.Iterator;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
	Vector<Integer> vList = new Vector<>();
		
		vList.add(10);
		vList.add(20);
		vList.add(30);
		vList.add(40);
		vList.add(50);
		
		System.out.println(vList);
		
		for(int i=0; i<vList.size(); i++) // for loop
		{
			System.out.println(vList.get(i) +100);
		}
		
        System.out.println("=================================================================");
		for( int k : vList ) // for each loop
		{
			System.out.println(k+100);
		}
		
		 System.out.println("=================================================================");
		
		 Iterator k = vList.iterator(); // Iterator
		 
		 while( k.hasNext()){
			 
			 System.out.println(Integer.parseInt(k.next().toString())+100);
		}
	}

}
