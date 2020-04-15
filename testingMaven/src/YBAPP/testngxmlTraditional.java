package YBAPP;
// Need of XML - We cannot run each testcases one by one.. SO we need to make all testcases in testsuite to run
///Here Testcases is each java file
//and each package is test suite.

import org.testng.annotations.Test;
//In this we have 2 regresssion group testcases
public class testngxmlTraditional {
@Test
public void size9()
{
	System.out.println("size 9");
}
@Test(groups = {"Regression"})
public void size7and8()
{
	// Used this in include/exlude tags in testNG & also , we can use regularexpression to achive more than one.
	//Example <include name ="TestcaseCanvas. will execute all test cases that match with this name
	
	System.out.println("size 7 and 8");
}

public void traditional1()
{
	System.out.println("First Traditional image");
}
@Test(groups = {"Regression"})
public void traditional2()
{
	System.out.println("Second Traditional Image");
}


}
