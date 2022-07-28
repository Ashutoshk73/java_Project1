package java2;

public class Java4 {
	
	int a=40;
	static int b = 100 ;
	int c;
	static int d;
	
	
	public Java4 ()
	{
		c=10;
		d=20;
	}
	
	public Java4(int x,int y)
	{
		c = 100;
		d = 200;
	
	}
		
	public Java4(int y)
	{
		y = a ;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Java4 k1 = new Java4(10);
		System.out.println(k1.a);
		System.out.println(b);
			
		Java4 k = new Java4();
		System.out.println(k.c);
		System.out.println(d);
		
		Java4 k2 = new Java4(20);
		System.out.println(k2.a);
	
		
		
		
				
		
		
	
		
	
		
		
		
	  

	}

}
