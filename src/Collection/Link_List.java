package Collection;

import java.util.LinkedList;

public class Link_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Object> list = new LinkedList<>();
		
		list.add(10);
		list.add("velocity");
		list.add(20);
		list.add("pune");
		
		System.out.println(list);
		int sum=0;
		for ( int i=0 ; i<list.size(); i++)
		{
			try{
				sum = sum+Integer.parseInt(list.get(i).toString()) ;
			}
			catch(Exception e) {
				System.out.println(list.get(i)+ " is not Digit");
				
			}
			
			System.out.println(sum);
		}
		
		
			
			
				
			
		}

	}


