package testngpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Ebay {
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com");
		
	}
	@Test(priority=1)
	public void totalLinkCount()
	{
		List<WebElement>link=driver.findElements(By.tagName("a"));
		System.out.println("total no of links in ebay.com:"+link.size());
	}
	
	@Test(priority=2)
	public void searchButtonVerification()
	{
		WebElement searchButton=driver.findElement(By.xpath("//input[@id=\"gh-btn\"]"));
	if (searchButton.isEnabled())
	{
		System.out.println("Ebay search button is enabled");
	}
	else
	{
		System.out.println("Ebay search button is disabled");
	}
		
	}
   @Test(priority=3)
   public void logo()
   {
	   Boolean logo=driver.findElement(By.xpath("//img[@id=\"gh-logo\"]")).isDisplayed();
   if(logo==true)
   {
	   System.out.println("ebay logo is displayed");
   }
   else
   {
	   System.out.println("ebay logo is not displayed");
	   
   }
   }
   @Test(priority=4)
   public void Dailydeals()
   {
	   String src=driver.getPageSource();
	   if(src.contains("daily deals"))
	   {
		   System.out.println("daily deal text is present");
	   }
	   else
	   {
		   System.out.println("daily deal text is not present");
	   }}}
	   
	   
	   
	   
	   
  
   
   
   
   
   
   
   
