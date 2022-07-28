package Xyz;

public class ClassD  {
	
	static String userName ;
	static String userPassword ;
	static String userMobiler ;
	static String userAdress ;
	static String userPincoad ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// set values
		
		ClassC k = new ClassC();
		k.setUserName("velocity");
		k.setUserPassword("1234");
		k.setUserMobiler("9876543210");
		k.setUserAdress("pune");
		k.setUserPincoad("102525");
		
		
		k.getUserName();
		userPassword = k.getUserPassword();
		userMobiler = k.getUserMobiler();
		userAdress = k.getUserAdress();
		userPincoad = k.getPincoad();
	
		
		System.out.println(k.getUserName());
		System.out.println(userPassword);
		System.out.println(userMobiler);
		System.out.println(userAdress);
		System.out.println(userPincoad);
		
		
			
	}
	
	}
	

	



//getters

	