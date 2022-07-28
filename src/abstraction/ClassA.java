package abstraction;

public abstract class ClassA {
    int a ;
	public ClassA(int a)
	{
		this.a = a;
	}

	abstract public void absmethod1();
	abstract public void absmethod2();
	
	public void demo1()
	{
		
		System.out.println("demo from ClassA");
	}
	 final public void demo2()
	{
		System.out.println("final demo from ClassA");
	}
}
