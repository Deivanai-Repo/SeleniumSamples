package YBAPP;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ybDbAccess {

	//Using Parameter concept from xml
	
	@Parameters({"URL","UName","PWD"})
	@Test
	public void loginDb(String url,String uname,String pwd)
	{
		System.out.println(url +":"+uname+":"+pwd);
	}
	
}
