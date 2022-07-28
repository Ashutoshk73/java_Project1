package Xyz;

public class Encapsulation {

	private String userName;
	private String userMobileNumber;
	private String userAdress;
	private String userpincode;
	
	// setters
	public void setUserName(String userName )
	{
	this.userName = userName ;
	}
	public void setUserMobileNumber(String userMobileNumber )
	{
	this.userMobileNumber = userMobileNumber ;
	}
	public void setUserAdress(String userAdress )
	{
	this.userAdress = userAdress ;
	}
	public void setUserpincode(String userpincode )
	{
	this.userpincode = userpincode ;
	}
	
	// getters 
	
	public String getUserName()
	{
		return userName ; 
	}
	public String getUserMobileNumber()
	{
		return userMobileNumber ;
	}
	public String getUserAdresse()
	{
		return userAdress ;
	}
	public String getUserpincode()
	{
		return userpincode ;
	}
}
