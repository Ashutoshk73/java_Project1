package ifelse;

import java.util.Scanner;

public class ClassI {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc =new Scanner(System.in);	
		System.out.println("entre Id");
		String Id =sc.next();	
		
		Scanner sc1 =new Scanner(System.in);	
		System.out.println("entre pw");
		String Pw =sc1.next();		
		
		String recId =(" Ashu ");
		String recPw =(" 123 ");
		
		if(Id.equals(recId))
		{
			if(Pw.equals(recPw))
			{
				System.out.println("you can login");
			}
			else
			{
				System.out.println("you can't login");
			}
		}
		else
		{
			System.out.println("wrong Id");
		}
		
		
		
		
	}
}
	
		
	
