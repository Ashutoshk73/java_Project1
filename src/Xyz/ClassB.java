package Xyz;

public class ClassB extends ClassA {
	int s ;
	public ClassB(int x)
	{ 
		super(10,20);
		s=55;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	   ClassA.addition();
	   addition();
	   
	   ClassB n = new ClassB(1);
	   System.out.println(n.s);
	  
	   ClassA m = new ClassA(10,20);
	   System.out.println(m.c);
	   System.out.println(m.d);
	   
	   n.addition(1);	
	}
	public static void addition()
	{
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println(c);
	}
	public void addition(int x)
	{
		System.out.println(super.c);
		System.out.println(super.d);
	
	}
	
	
}