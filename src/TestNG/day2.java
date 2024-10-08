package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	
	@Test(groups= {"Smoke"})
	public void loan()
	{
		System.out.println("good");
	}
	
	/*
	 * @BeforeTest will execute before all the tests
	 * This can be used if you want to clean up your data 
	 * Or if you want to delete data from database
	 */
	
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("I will execute first");
	}
	
	/*
	 * @AfterTest will execute after all the tests in a particular test folder.
	 * It does not appear at the end of all the test folders
	 * It is generally used to delete the cookies
	 */
	
	@AfterTest
	public void lastExecution()
	{
		System.out.println("I will be executed at last");
	}
}
