
public class Class5 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Class5 p = new Class5();
    	p.addition(10,20);
    	p.substraction(40, 30);	
    	p.multiply(5, 10);
	}
	
	public void addition(int x,int y )
	
	{	
	int a = x;
	int b = y;
	int c = a+b;
	System.out.println(c);
	}
	
    public void substraction(int x,int y )
	{	
	int a = x;
	int b = y;
	int c = a-b;
	System.out.println(c);
	}
    
    public void multiply (int x,int y )
   	{ 		
   	int a = x;
   	int b = y;
   	int c = a*b;
   	System.out.println(c);
   	}
}
