package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day5 {
	
	@Parameters({"URL"})
	@Test
	public void loan(String urlname)
	{
		System.out.println("good");
		System.out.println(urlname);
	}

}
