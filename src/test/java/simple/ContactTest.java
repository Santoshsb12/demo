package simple;

import org.testng.annotations.Test;

public class ContactTest {
	@Test(groups = "SmokeTest")
	public void contactTest()
	{
		System.out.println("contact created");
		String value=System.getProperty("BROWSER");
		String value1=System.getProperty("url");
		System.out.println(value);
		System.out.println(value1);
		
	}
	
	/*
	@Test(groups = "RegressionTest")
	public void editcontactTest()
	{
		System.out.println("contact edited");
	}
	
	@Test(groups = "RegressionTest")
	public void deletecontactTest()
	{
		System.out.println("contact deleted");
	}
	*/
}
