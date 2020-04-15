package YBAPP;

import org.testng.annotations.Test;

public class parellelTesting {

// Thread count matters here in parallel execution in Suite tag.
	
	//If Thread ocunt and number of method matches then each will execute parallel
	//<suite thread-count="3" parallel="methods" name="RegressionSuite">
	/* Result
In Test1: 14
In Test3: 16
In Test2: 15
	 */
	
	//If thread count less than Method count ,then 2 will run parallel and one will pick up by first compeltion thread.
	//<suite thread-count="2" parallel="methods" name="RegressionSuite">
	/* Result
In Test1: 14
In Test2: 15
In Test3: 15 */
@Test
	public void test1()
	{
		System.out.println("In Test1: "+Thread.currentThread().getId());
	}
	@Test
	public void test2()
	{
		System.out.println("In Test2: "+Thread.currentThread().getId());
	}
	@Test
	public void test3()
	{
		System.out.println("In Test3: "+Thread.currentThread().getId());
	}
}
