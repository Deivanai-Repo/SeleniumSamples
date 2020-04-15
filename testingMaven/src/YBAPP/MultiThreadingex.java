package YBAPP;

import org.testng.annotations.Test;

public class MultiThreadingex {

	//Multithreading can be achived in 3 parameters
//	<suite thread-count="2" parallel="methods" name="RegressionSuite">
/*	Result 
    In Test2: 16
	In Test1: 17
	In Test2: 18
	In Test1: 19
	In Test3: 14*/
	
	@Test(threadPoolSize =3,invocationCount=2, timeOut =1000)
	  
	public void test1()
	{
		System.out.println("In Test1: "+Thread.currentThread().getId());
	}
	@Test(threadPoolSize =3,invocationCount=2, timeOut =1000)
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
