package Practice;

import java.util.Arrays;

public class ClassE {

	public static void main(String[] args) {
	   int []a = {1,0,2,3,0,5,4};
	   System.out.println(Arrays.toString(a));
	   
		for(int i=0; i<a.length; i++)
		{  
			for(int j=(i+1); j<a.length; j++)
			{
			   if(a[i]>a[j])
			   {
	
				   int k=a[i];
				   
				   a[i]=a[j];
				   a[j]=k;
			   }
		}}
		System.out.println(Arrays.toString(a));
		   
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
//	   int x= a[1];
//	   a[1]=a[6];
//	   a[6]=x ;
//	   int y =a[4];
//	   a[4]=a[5];
//	   a[5]=y;
//	   
//	   System.out.println(Arrays.toString(a));
	}


