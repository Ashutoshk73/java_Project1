package Xyz;

public class Encapsub {
	static String userName;
	static String userMobileNumber;
	static String userAdress;
	 String userpincode;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//setters
		Encapsulation k = new Encapsulation();
		k.setUserName("Velocity");
		k.setUserMobileNumber("9876543210");
		k.setUserAdress("katraj");
		k.setUserpincode("455632");
		
		//getters
		
		Encapsub j = new Encapsub();
		
		userName = k.getUserName();
		userMobileNumber = k.getUserMobileNumber();
		userAdress=k.getUserAdresse();
		j.userpincode=k.getUserpincode();
		
		System.out.println(userName+" "+userMobileNumber+" "+userAdress+" "+j.userpincode);
    
		// new initilazation
		
		k.setUserName("motion");
		k.setUserMobileNumber("0123456789");
		k.setUserAdress("Pune");
		k.setUserpincode("455652");
		
		
		userName = k.getUserName();
		userMobileNumber = k.getUserMobileNumber();
		userAdress=k.getUserAdresse();
		j.userpincode=k.getUserpincode();
		
		System.out.println(userName+" "+userMobileNumber+" "+userAdress+" "+j.userpincode);
		
		
		
	}

}
