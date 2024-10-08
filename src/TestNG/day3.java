package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day3 {
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before executing any method in the class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After executing all the methods in the class");
	}
	
	// In TestNG order of the test method execution depends on alphabetical order
	
	@Test(groups= {"Smoke"})
	public void WebLoginCarLogin()
	{
		//selenium
		System.out.println("WebLoginCarLogin");
	}
	
	@Test(timeOut=4000)
	public void MobileLoginCarLoan()
	{
		//Appium
		System.out.println("MobileLoginCarLoan");
	}
	
	@Test(enabled=false)
	public void MobileSignInCarLoan()
	{
		//Appium
		System.out.println("MobileLoginCarLoan");
	}
	
	// If a test case is required to be run before a particular test case, then we can use dependsOnMethod helper attributes
	
	
	@Test(dependsOnMethods= {"WebLoginCarLogin", "LoginAPICarLoan"})
	public void MobileSignOutCarLoan()
	{
		//Appium
		System.out.println("MobileLoginCarLoan");
	}
	
	
	// AfterSuite will be executed after executing all the tests
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("I am number 1 from last");
	}
	
	
	// BeforeSuite will be executed before executing all the tests
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("I am number 1.");
	}
	
	@Test(dataProvider = "getData")
	public void LoginAPICarLoan(String username, String password)
	{
		//Rest API
		System.out.println("LoginAPICarLoan");
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		/*
		 * 1st- username password - good credit history
		 * 2nd- username password - no credit history
		 * 3rd- fraudulent credit history
		 */
		
		Object[][] data = new Object[3][2];
		//1st set
		data[0][0]= "firstsetusername";
		data[0][1]="password";
		// Columns in  the row are values for that particular combination
		
		//2nd set
		data[1][0]="secondsetusername";
		data[1][1]="scondpassword";
		
		//3rd set
		data[2][0]="thitdsetusername";
		data[2][1]="thirdusername";
		return data;
		
	}

}
