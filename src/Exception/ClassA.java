package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import pkg1.Practice;

public class ClassA {
	
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
	
		System.out.println("velocity");
		Thread.sleep(4000);
		System.out.println("katraj");
		
		ClassA k = new ClassA();      // calling below method
		k.getDataFromExternalFile();
	


	}


	public void getDataFromExternalFile() throws IOException, InterruptedException 
	{
		FileInputStream file = new FileInputStream("\\ashutosh");
		
		Properties prop =new Properties ();
		prop.load(file);
		System.out.println(prop);
		
		Thread.sleep(4000);
		
		System.out.println("Katraj");
		
		
		
		
		
		
	}
	
	
}

		
		
		

	

