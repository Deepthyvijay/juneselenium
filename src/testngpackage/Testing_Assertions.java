package testngpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Testing_Assertions {
	ChromeDriver driver;
	
	@BeforeTest
	public void SetUp()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void titleverification()
	{
		driver.get("https://www.facebook.com/");
		String actualtitle=driver.getTitle();
		String exp="Facebook";
		
	Assert.assertEquals(actualtitle,exp,"title comparison failed");
	System.out.println("title verified");
	}
	

}
