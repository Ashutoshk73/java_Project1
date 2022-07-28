package ifelse;

import java.util.Scanner;

public class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = 10;
		int b= 20;
		int c=30;
		int d=40;
		
		if (a>b)
		{
			if(a>c)
			{
				if(a>d)
				{
					System.out.println("a is greast:"+a);
				}
				else
				{
					System.out.println("d is greater:"+d);
				}		
			}
			else
			{
				if(c>d)
				{
					System.out.println("c is greater:"+c);
				}
				else
				{
					System.out.println("d is greater:"+d);
				}
			}
		}
		else
		{
			if(b>c)
			{
				if(b>d)
				{
					System.out.println("b is greater:"+b);
				}
				else
				{
					System.out.println("d is greater:"+d);
				}
			}
			else
			{
				if(c>d)
				{
					System.out.println("c is greater:"+c);
				}
				else
				{
					System.out.println("d is greater:"+d);
				}
			}
		}

	}

}
