package pkg1;

public class ClassS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// Addition from 1 to 10 skipping 5 number
		int sum=0;
		for ( int i=1; i<=10; i++)
		{
			if (i==5)
			{
				System.out.println("skipping"+i);
				continue;
			}
			sum =sum + 1;
			System.out.println(sum);
		}

	}

}
