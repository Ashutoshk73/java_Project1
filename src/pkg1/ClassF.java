package pkg1;

public class ClassF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<(i+1); j++)
			{
				System.out.print("   ");
			}
			for(int k=10; k>(i-1); k-- )
			{
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}
