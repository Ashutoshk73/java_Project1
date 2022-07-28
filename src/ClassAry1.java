import java.util.Arrays;

public class ClassAry1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a []= {"001","Ashutosh","Civil"};
		String b []= {"002","Mayur","Bcs"};
		String c []= {"003","Saurabh","Bcs"};
		String d []= {"004","Ashwini","Mcs"};
		String e []= {"005","Sayli","elec"};
		
		String K[][]={a,b,c,d,e};
		System.out.println(Arrays.deepToString(K));
		System.out.println(Arrays.toString(K[0]));
		System.out.println(Arrays.toString(K[1]));
		System.out.println(Arrays.toString(K[2]));
		System.out.println(Arrays.toString(K[3]));
		System.out.println(Arrays.toString(K[4]));

	}
}


