package Xyz;

public class ClassA {
	
	int c ;
	int d ;
	public ClassA(int x,int y)
	{
		c= x;
		d =y;
	}
	
	public static void main(String[]args)
	{
		
		ClassA k = new ClassA(1,2);	
		System.out.println(k.c);
		addition();	
	}
	
	public static void addition()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	

}


		


