package Practice;

public class ClassM {
	public static void main(String[] args) {
		
		int a = 50 ;
		int count = 0;
		for(int i=0;i<100;i++)
		{
			if (a%i==0)
			{
				count++;
				System.out.println("prime");
			}
			else{
				System.out.println("not a prime");
			}
		}
		
		
	}

}
