
public class Class1 {

	    int c ;
	    static int d ;
	    
	    public Class1()	    
	    {
	    	c =10 ;
	    	d =20 ;
	    }
	    public Class1(int x)
	    {
	        c =30;
	    	d =40;	
	    }
	    
	    public Class1(String w)
	    
	    {
	    	c =50;
	    	d =60;	
	    }
	    
	    public static void main(String[] args) 
	    {
            Class1 obj = new Class1();
	    	System.out.println(obj.c);
	    	System.out.println(d);
	 	
	    	 Class1 k = new Class1(1);
	    	System.out.println(k.c);
	    	System.out.println(d);
	    	
	    	 Class1 k1 = new Class1("velocity");
	    	System.out.println(k1.c);
	    	System.out.println(d);
	    
	    }
	    	
	    }
	    	

	    	
	    	