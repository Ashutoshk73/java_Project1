package ifelse;

import java.util.Scanner;

public class ClassH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner (System.in);
		System.out.println("entre the value");
		int a = scn.nextInt();
		
		if (a<0 || a>100)
		{
			System.out.println(" invalid percentage");
		}
		
		    else if (a>90)
		    {
			System.out.println("First Class With Distinction");
		    }
			else if(a>80)
			{
				System.out.println("Distinction");
			}
			else if(a>60)
			{	
				System.out.println("First Class");
			}
			else if (a>40)
			{
				System.out.println("Pass");
			}
			else if (a<40)
			{
				System.out.println("Fail");
		
		    }
		
		
		
		
	}

}
