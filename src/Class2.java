
public class Class2 {
	
	
	
	int c;
	static int d;
	
	public Class2()
	{
	 c = 300;
	 d = 400;
	}
	
	public Class2(int x)
	{
	 c = 500;
	 d = 600;
	}
	
	public Class2(int x ,int y)
	{
	 c = 700;
	 d = 800;
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int d = 10;
		int e = 20;
		System.out.println(d);
		System.out.println(e);
				
		Class2 w = new Class2();
		Class2 m = new Class2(1);
		Class2 n = new Class2(1,2);
		
		new Class2();
		System.out.println(w.c);
		System.out.println(Class2.d);
		
		new Class2(1);
		System.out.println(m.c);
		System.out.println(Class2.d);
		
        new Class2(1,2);
		System.out.println(n.c);
		System.out.println(Class2.d);


	}

}
