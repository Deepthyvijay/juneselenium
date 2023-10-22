package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragandDrop {
	
ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
	}
@Test
public void test()
{
	Actions act=new Actions(driver);
	
	WebElement first5000=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	WebElement debitAmount=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
	act.dragAndDrop(first5000, debitAmount).perform();
	
	WebElement Bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	WebElement debitAccount=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
	act.dragAndDrop(Bank, debitAccount).perform();
	
	WebElement next5000=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	WebElement CreditAmount=driver.findElement(By.xpath("//*[@id=\"amt8\"]"));
	act.dragAndDrop(next5000, CreditAmount).perform();
	
	WebElement Sales=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
	WebElement CreditAmount1=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
	act.dragAndDrop(CreditAmount1, Sales).perform();
	
	String text=driver.findElement(By.xpath("//*[@id=\"equal\"]/a")).getText();
	System.out.println(text);
	if(text.equals("perfect"))
	{
		System.out.println("perfect is printed");
	}
	else
	{
		System.out.println("perfect is not printed");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
}
