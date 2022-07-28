package Collection;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		
		TreeSet tSet = new TreeSet();
		
		tSet.add("Mumbai");   //  TreSet Sort the data 
		tSet.add("pune");
		tSet.add("Nagpur");
		tSet.add("Aurangabad");
		
		System.out.println(tSet);
		
		for( Object k : tSet)  // for ech loop
		{
			System.out.println(k+" City");
		}

	}

}
