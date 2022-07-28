package pkg1;

public class Practice {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// do while
		
		for(int i=0; i<10; i++);
		{  
			
			int  n = i ;
			 int count=0;
			
			
			while(n>0)
			{
				int k = i%n ;
				if(k==0)
				{
					count++;
				}
				n--;
		
				
			}
			if(count==2)
			{
				System.out.println("it is prime");
			}
			
		}
		
	}}
