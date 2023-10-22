package testngpackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandler {
	ChromeDriver driver;
	
	@BeforeTest

	public void beforetest ()
	{
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/popup.php");
	driver.manage().window().maximize();
	
	}
	
	@Test
	public void test()
	{
		
	String parentWindow=driver.getWindowHandle();//current window which is returns details (id)of the main page
		
		System.out.println("Parent Window Title"+driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();//locating the 'click here'button
		
		
		Set <String> allWindowsHandle=driver.getWindowHandles();//returns details of multi window
		
		for(String handle : allWindowsHandle)//for each loop to fetch the details of all windows
			
			if (!handle.equalsIgnoreCase(parentWindow))
					{
				driver.switchTo().window(handle);
				
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("acg@gmail.com");
				driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
				
				driver.close();
					}
				
				driver.switchTo().window(parentWindow);
				
					}
				
				
				
				
					}
			
			
			
			
			
			
			
		
	

