package YBAPP;

import org.testng.ITestListener;
import org.testng.ITestResult;
 

public class itestListner implements ITestListener {

	 @Override
	 public void onTestStart(ITestResult r)
	 {
		 System.out.println("Test Started");
	 }
	 
	 @Override
	 public void onTestFailure(ITestResult r)
	 {
		 System.out.println("Failed");
	 }
	 public void onTestSuccess(ITestResult r)
	 {
		 System.out.println("Success");
	 }
	 
}
