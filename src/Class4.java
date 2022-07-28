
public class Class4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		name();

	}

public static void addition(int x,int y ,int z)

{
	int a = x;
	int b = y;
	int c = z;

	System.out.println(c);	
}

public static void sustraction()

{
	addition(10,20,30);
	
	int a = 10;
	int b = 20;
	int c = a-b;

	System.out.println(c);
	
}

public static void multiplition()

{
	sustraction();
	int a = 10;
	int b = 20;
	int c = a*b;

	System.out.println(c);
}

public static void division()

{
	multiplition();
 	int a=100 ;
 	int b = 20;
 	float c = a/b;
 	System.out.println(c);
 }

public static void name()
{	
	division();
 	String c= "Ashutosh ";
 	System.out.println(c);
 }
}
