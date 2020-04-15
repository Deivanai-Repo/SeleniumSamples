package YBAPP;
 
 

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng   {
	@Test(priority=2)
//	@Test(enabled=false)
public void step1()
{
		Assert.assertEquals("Test", "Test");
	System.out.println("With Priority 2 & Expecting lister to invoke");
}
	public void step6()
	{
			Assert.assertEquals("Test", "Test");
		System.out.println("New step");
	}
	@Test(dependsOnMethods={"step1"})
public void step4()
	{
			Assert.assertEquals("Test", "Test");
		System.out.println("Based on With Priority 2");
	}
	@BeforeTest
public void step2()
{
	System.out.println("Before Test");
}

	@AfterTest()
public void step3()
{
	System.out.println("After Test");
}
	
	@BeforeMethod()
	public void stepBefore()
	{
		System.out.println("Before Every Method");
	}
	@AfterMethod()
	public void stepAfter()
	{
		System.out.println("After Every Method");
	}
}