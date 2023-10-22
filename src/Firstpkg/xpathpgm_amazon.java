package Firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//Q)Open Amazon.in -search mobiles-click cart-click new releases-click amazon renewed
public class xpathpgm_amazon
{
	ChromeDriver driver;
	@Before
	public void openAmazon() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");//open Amazon.in
		Thread.sleep(60000);
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("mobiles");//enter mobiles in the search field
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();//search mobiles
		driver.findElement(By.xpath("//a@id='nav-cart']")).click();//open cart
		driver.findElement(By.xpath("//a@id='nav-xshop']/a[6]")).click();//click new releases
		driver.findElement(By.xpath("//a@data-card-metrics-id=\"p13n-zg-nav-tree-all_zeitgeist-lists_1\"]/div[2]/div[2]/a")).click();//click Amazon renewed
		
	}
	
	
}