package HashMap;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<String,String> hMap = new HashMap<>();
		
		hMap.put("Ashutosh", "Kurulekar");
		hMap.put("Akshay", "Ratnaparkhe");
		hMap.put("Santosh", "kadam");
		hMap.put("Abhijeet", "khandhare");
		hMap.put(null, "khandhare");
		
		
		
		System.out.println(hMap);
		System.out.println(hMap.get("Ashutosh"));
		
		// there is no insertion order
		// key must be unique
		
		

	}

}
