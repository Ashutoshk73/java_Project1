package pkg1;

import java.util.Scanner;

public class ClassO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// prime number by while
		Scanner scn = new Scanner(System.in); 
		System.out.println(" entre the number");
		int i = scn.nextInt();
		
		{
			int count=0;
			int n=i;
			while(n>0)
			{
				int K=i%n ;
				if(K==0)
					
				{
					count++ ;
				}
				n-- ;
						
			}
			if(count==2){
				System.out.println(i+" is prime number");
			}
			else
			{
				System.out.println(i+" is not a prime number");
			}
			
		}
		 
		 
		}
			
			

	}


