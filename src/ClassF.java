
public class ClassF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a []=new int [5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		
		
		if((a.length)%2==0)
		{
			System.out.println("this is even value"+a.length);
		}
			
		else
		{
			int k=(a.length)/2 ; // 5/2=2.5
			System.out.println(a[k]);
			
		}
		

	}

}
