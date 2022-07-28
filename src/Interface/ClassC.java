package Interface;

public class ClassC implements ClassA,ClassB{

	@Override
	public void absMethod1() {
		System.out.println("absMethod1 from ClassA compleated in concrete ClassC");
		
	}

	@Override
	public void absMethod2() {
		
		System.out.println("absMethod2 from ClassA compleated in concrete ClassC");
	}
	
	@Override
	public void absMethod3() {
		System.out.println("absMethod3 from ClassB compleated in concrete ClassC");
		
	}

	@Override
	public void absMethod4() {
		
		System.out.println("absMethod4 from ClassB compleated in concrete ClassC");
	}


	
}
	


