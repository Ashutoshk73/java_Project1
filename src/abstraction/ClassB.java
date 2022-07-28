package abstraction;

public class ClassB extends ClassA{

	public ClassB(int a) {
		super(10);
		
	}

	@Override
	public void absmethod1() {
		
		System.out.println("abstract method1 compleated in ClassB");
	}

	@Override
	public void absmethod2() {
		
		System.out.println("abstract method2 compleated in ClassB");
	}
	public void demo1()
	{
		System.out.println(" demo method in concreate calss");
	}

	

}
