package Exception;

public class ClassB  {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int a= 10;
	int b=0;
	int []k ={1,2,3,4};
	
	try {
		
		int c = a/b ;
		System.out.println(c);
		}
	     catch(Exception e)
	{
	    	 System.out.println("you can not divide any int by zero");
	    	 try
	    	 {
	    		 int p= k[4];
	    			System.out.println(p);
	    	 }
	    	 catch(Exception m)
	    	 {
	    			{
	    			    	 System.out.println("last index is size-1");
	    			}    	     	
	}}
	finally
	{
		System.out.println("calling finally block");
	}
	
}}
