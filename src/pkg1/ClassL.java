package pkg1;

public class ClassL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// fibonacci
		
		int a=0;
		int b=1;
		int c;
		
		System.out.print(a+" "+b);
		
		for(int i=0; i<10; i++)
		{
			c=a+b;
			System.out.print(" "+c);
			
			a=b;
			b=c;
			
			
			
		}

	}

	
}
