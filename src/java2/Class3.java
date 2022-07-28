package java2;

public class Class3  {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Class3 k = new Class3();
		k.addition();
	
		Class3 p= new Class3();
		p.substraction(10,20);
		
		multiplication();

	}

	 protected void addition()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	
	}
	
	public void substraction(int x,int y)
	{
		int a = x;
		int b = y;
		int c = a-b;
		System.out.println(c);
	}
	public static void multiplication()
	{
		int a = 10;
		int b = 20;
		int c = a*b;
		System.out.println(c);
	}

}
