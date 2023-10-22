package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload_sendKeys {
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
	}
	
	//if text field is available to upload a file then we can use sendkeys

	@Test
	public void test()
	{
	//to locate file upload text field and sendkeys the file path
	driver.findElement(By.xpath("//input[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\deept\\OneDrive\\Desktop\\Testing Notes.jpg");

	//to click of terms and condition checkbox//

driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
	
	//to click on submit button
	driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	
	
	}
	
}
	

	
