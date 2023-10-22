package Firstpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkcount {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test1()
	{
		driver.get("https://www.facebook.com");
		List <WebElement>linkdetails=driver.findElements(By.tagName("a"));
		System.out.println ("total number of links="+linkdetails.size());
		for(WebElement ele:linkdetails)
		{
			String linkdetails1=ele.getAttribute("href");
			String linktext=ele.getText();
			System.out.println(linkdetails+"-------"+linktext);
			
		}
		
	}

}
