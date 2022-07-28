package pkg1;

import java.util.Arrays;

public class ClassM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ascendind Array 
		
		int a[]= {1,5,7,8,6,4,9,3};
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
			
		
		

	}}



