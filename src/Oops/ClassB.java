package Oops;

public class ClassB  extends ClassA{
	
	int a=40;
	int b=50;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassB k = new ClassB ();
		k.addition();
		
		int c=(k.a+k.b) ;
		System.out.println("Addition of a,b from ClassB is "+
		c);

	}

}
