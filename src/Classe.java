import java.util.Arrays;

public class Classe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a []=new int [5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		int b= a.length;
		System.out.println(Arrays.toString(a));
		System.out.println((b));
		
		// replacing the values
		
		int p = a[0];
		a[0] = a[( a.length)-1];
		System.out.println(Arrays.toString(a));
		a[(a.length)-1] = p;
		System.out.println(Arrays.toString(a));
		
		
		
		// second method
		// int p=a[0];
		
		a[0]=a[4];
		System.out.println(Arrays.toString(a));
		
		a[4]=p;
		System.out.println(Arrays.toString(a));
	     
		
	  
		

	}

}
