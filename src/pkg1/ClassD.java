package pkg1;

public class ClassD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for (int i=0 ; i<10 ; i++)
		{
			for(int j=10; j>(i); j--)
			{
				System.out.print("   ");
			}
			for(int k=0; k<(i+1); k++)
			{
			
				System.out.print(" * ");
			}
			System.out.println();
		}

	}
	

}

