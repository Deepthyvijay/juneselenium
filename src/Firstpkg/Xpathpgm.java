package Firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathpgm {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test1()
	{
		
	driver.get("http://www.facebook.com");
	driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("deepu@gmail.com");
driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abc");
driver.findElement(By.xpath("//button[@name='login']")).click();
	
	}}


