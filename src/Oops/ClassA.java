package Oops;

public class ClassA {
	
	int a=20;
	int b=30;
	static int c= 40;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassA i =new ClassA();
		i.addition();

	}
	
	public void addition()
	{
		ClassA k =new ClassA();
		int d = (k.a + k.b + c);
		System.out.println("Addition of a,b,c from ClassA is " +d);
	}

}
