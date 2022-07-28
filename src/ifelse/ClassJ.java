package ifelse;

import java.util.Scanner;

public class ClassJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scn = new Scanner(System.in);
	System.out.println(" entre case number");
	int a = scn.nextInt();
	
	switch(a)
	{
	case (1):
		System.out.println("low level bug");
	break;
	
	case (2):
		System.out.println("medium level bug");
	break;
	
	case (3):
		System.out.println("high level bug");
	break;
	
	default:
		System.out.println(" bug resolved");
	}
	}

}
