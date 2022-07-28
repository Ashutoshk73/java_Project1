package pkg1;

public class ClassK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<20; i++)
		{
			for(int j=20; j>(i+1); j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<i+1; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}

}
