package Casting;

public class ClassC {

	public static void main(String[] args) {
		
		System.out.println(" **********upcasting**********");
		
        ClassA j = new ClassA();
        j.demo1();
        j.demo2();
        j.demo3();
        
		Upcasting k = new ClassA(); //  Upcasting 
		
		k.demo1();
		k.demo2();
	
		
	
		
		System.out.println(" **********Downcasting**********");
		
		Downcasting t = new ClassB();
		
		ClassB s =   (ClassB) t ;
		
		s.demo1();
		s.demo2();
		s.demo3();
		
		
		
		
		
		
      
       
		

	}

}
