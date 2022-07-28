package pkg1;

public class ClassR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		multiplication();

	}
	
	public static int addition()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		return c;
	}

	public static int multiplication()
	{
		int i=5;
		int j=addition();
		int l =i*j ;
		System.out.println(l);
		return l;
		
	}
}
