package HashMap;

import java.util.Hashtable;
import java.util.Map;

public class HashTable1 {

	public static void main(String[] args) {
		Hashtable<String,String> hTable = new Hashtable<>();
		
		hTable.put("Ashutosh", "Kurulekar");
		hTable.put("Akshay", "Ratnaparkhe");
		hTable.put("Santosh", "kadam");
		hTable.put("Abhijeet", "khandhare");
		
		System.out.println(hTable);
		
		for(Map.Entry<String,String> k: hTable.entrySet())
		{
			System.out.println("Name :- " +k.getKey()+" / " +"Surname :- "+k.getValue());
		}
	}

}
