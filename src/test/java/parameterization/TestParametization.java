package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


//Simple Data from Dataprovider not from excel sheet.
public class TestParametization 
{
	
	@Test(dataProvider ="Logindata")
	public void doLogin(String username,String password) //arguments should match with data provider here..
	{
		System.out.println(username+"----"+password);
	}




@DataProvider (name="Logindata")
public Object [][] getdata()
{
	
	
	Object [][] data = new Object [3][2];
	
	data [0][0] = "Neeraj.jain@xchanging.com";
	data [0][1] = "Password";	
	
	data [1][0] = "Dhruv.mohan@xchanging.com";
	data [1][1] = "Password";		
	
	data [2][0] = "ABC@xchanging.com";
	data [2][1] = "Password";		
	
	
	return data;
	
	
}

}