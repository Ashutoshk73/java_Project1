package pkg1;

import java.util.Arrays;

public class ClassN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a []={1,2,3,4,5};
		 System.out.println(Arrays.toString(a));
		
		 for( int i=1; i<=a.length; i++ )
		{
			for(int j=(i+1); j<=4; j++)
			{
			int k=a[i];
			int m=a[j];
			int n=k*m;
			
			System.out.println(n);
		
			
			}
		}
 
	}

}
