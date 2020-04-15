package YBAPP;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//Using Data Provider concept from xml

public class MainPage {
@Test(dataProvider="userType")
public void dashBoardTestcase(String uname, String pwd)
{
	System.out.println(uname +":"+ pwd);
}


@Test(dataProvider ="userType")
public void OverviewSectionTestcase(String uname, String pwd)
{
	System.out.println(uname +":"+ pwd);
}





@DataProvider(name="userType")
public Object[][] dashBoardData()
{
	Object[][] ob =new Object[4][2];
			// 4-> Number of user like Editor,Global,Territory, Student ie. NUmber of sets of data
			//2->Number of data in each sets.
			
			ob[0][0]="Editoruser";
			ob[0][1]="pwd1";
			
			ob[1][0]="GlobalUser";
			ob[1][1]="12344";
			
			ob[2][0]="TerritoryUser";
			ob[2][1]="32322";
			
			ob[3][0]="StudentUser";
			ob[3][1]="23232";
					
			return ob;
			
}
}


















