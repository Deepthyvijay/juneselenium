package POMTEST;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testngpackage.Marinerspage;

public class Marinerspagetest {
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://marinersforex.com/Flights-Booking");
		driver.manage().window().maximize();
		
	}
	
	
	@Test
	public void test() throws Exception
	{
		Marinerspage obj=new Marinerspage(driver);
		obj.selectDate();
		obj.selectTravellernClass();
		obj.SelectSearch();
		
		}
	

}
