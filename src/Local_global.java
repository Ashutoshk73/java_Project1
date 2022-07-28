
public class Local_global {
	static int a = 200; // static global variable

	int h =500;         // non-static global variable
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= 100;//local variable
		
		System.out.println(a);
		System.out.println(Local_global.a);
		
		// objection creation
		
		Local_global x = new Local_global();
		System.out.println(x.h);  // printing non-static global variable
		

	}

}
