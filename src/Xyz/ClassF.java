package Xyz;

public class ClassF {
	static String userName;
	static String userMobileNumber;
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassE k=new ClassE();
		
		k.setUserName("Ashutosh");
		k.setUserMobileNumber("7387770017");
		
		userName = k.getUserName();
		userMobileNumber = k.getUserMobileNumber();
		
		
	System.out.println(userName+" "+userMobileNumber);
		
		
	

	
	}

}
