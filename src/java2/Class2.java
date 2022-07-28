package java2;

public class Class2 {
	
	static int rollNumber  ;
	String studentName  ; 
	
	public Class2(int x,String y)
	{
		 rollNumber = x ;
		 studentName = y ;
	}
	 
	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
			
		Class2 p = new Class2(1,"Ashutosh");
		System.out.println(rollNumber);
		System.out.println(p.studentName);
		
		Class2 w = new Class2(02 , "Shrinath");
		System.out.println(rollNumber);
		System.out.println(w.studentName);
		
		Class2 g = new Class2(03 , "Mahesh");
		System.out.println(rollNumber);
		System.out.println(g.studentName);
		
		Class2 l = new Class2(04 , "Shubham");
		System.out.println(rollNumber);
		System.out.println(l.studentName);
		
		Class2 k = new Class2(05 , "vaibhav");
		System.out.println(rollNumber);
		System.out.println(k.studentName);
		
		
		
		
		
		
	
		
		
		
	}

}
