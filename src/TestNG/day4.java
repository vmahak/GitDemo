package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day4 {
	
	@Test
	public void WebLoginHomeLogin()
	{
		//selenium
		System.out.println("WebLoginHomeLogin");
	}
	
	@Test
	public void MobileLoginHomeLoan()
	{
		//Appium
		System.out.println("MobileLoginHomeLoan");
	}
	
	@Test(groups= {"Smoke"})
	public void LoginAPIHomeLoan()
	{
		//Rest API
		System.out.println("LoginAPIHomeLoan");
	}
	
	/*
	 * If there are 4 tests (methods in a class), the the "Before Method" will run before every test
	 * BeforeMethod -> 1 test -> BeforeMethod -> 2 test -> BeforeMethod -> 3 Test -> BeforeMethod -> 4 Test
	 */
	
	@BeforeMethod
	public void BeforeEvery()
	{
		System.out.println("I will execute before every method in the day 4 class.");
	}
	
	/*
	 * If there are 4 tests (methods in a class), the the "After Method" will run after every test
	 * 1 test -> AfterMethod -> 2 test -> AfterMethod -> 3 Test -> AfterMethod -> 4 Test -> AfterMethod
	 */
	
	@AfterMethod
	public void AfterEvery()
	{
		System.out.println("I will execute after every method in the day 4 class.");
	}

}
