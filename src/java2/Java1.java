
package java2;

public class Java1 {
	
	static int studentRollNumber ;
	String studentName ;
	
	public Java1(int x,String y) 
	
	{
		studentRollNumber = x ;
		studentName = y ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Java1 p = new Java1(01 ,"Ashutosh");
		
		System.out.println(studentRollNumber);
		System.out.println(p.studentName);
		
 
	
	    Java1 w = new Java1(02 ,"Akshay");
	
	    System.out.println(studentRollNumber);
	    System.out.println(w.studentName);
	    
	    Java1 m = new Java1(03 ,"saurabh");
		
	    System.out.println(studentRollNumber);
	    System.out.println(m.studentName);
	
	
	}
	
  

}