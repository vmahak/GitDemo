package TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	
	/*
	 * TestNG acts as a Java compiler.
	 * If you incorporate testNG library in you test case then you don't need to depend on java compiler
	 * example: public static void main(String[] args)	
	 * We will use TestNG Library instead of Java compiler
	 * 
	 * How to run tests with TestNG? 
	 * You need to have @Test annotation followed by methods
	 * 
	 * We can develop multiple test cases in 1 single file.
	 * 
	 * Test Suite -> Test Folder (Module) -> Test Cases
	 * 
	 * You can modularize the test case based upon the functionality and trigger them accordingly
	 * 
	 * You can also get a control on running specific methods from test cases
	 */
	
	@AfterTest
	public void lastExecution()
	{
		System.out.println("I will execute at last");
	}
	
	
	@Test(groups= {"Smoke"})
	public void Demo()
	{
		System.out.println("Hello");
		Assert.assertTrue(false);
	}
	
	@Test
	public void secondTest()
	{
		System.out.println("Bye");
	}
}
