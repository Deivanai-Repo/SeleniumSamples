package YBAPP;

import org.testng.annotations.Test;

public class testngxmlcutout {
	//2 TC under Regression Groups
@Test(groups = {"Regression"})
public void size7()
{
	System.out.println("Size 7 ");
}
@Test
public void Size8()
{
	System.out.println("Size 8");
}
@Test(groups = {"Regression"})
public void cutout1()
{
	System.out.println("First cutout image");
}
@Test
public void cutout2()
{
	System.out.println("Second cutout Image");
}


}
