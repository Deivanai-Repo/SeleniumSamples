package YBAPP;

import org.testng.annotations.Test;
//I Testcases under Regression Group
public class testngxmlcanvaseImage {
@Test
public void canvas1()
{
	System.out.println("First Canvase");
}
@Test
public void canvas2()
{
	System.out.println("Second Canvas");
}
@Test(groups = {"Regression"})
public void Image1()
{
	System.out.println("First Canvase image");
}
@Test
public void Image2()
{
	System.out.println("Second Canvas Image");
}


}
