package Firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test1()
	{
		/*select class is used for dropdown handling.
		 select class consist of 3 method-(ByIndex,ByVisibletext,ByValue)*/
		 
driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
WebElement dayelement=driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
Select day=new Select(dayelement);
day.selectByIndex(02);

WebElement monthelement=driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
Select month=new Select(monthelement);
month.selectByVisibleText("JAN");

WebElement yearelement=driver.findElement(By.xpath("//*[contains(@name,'DOB_Year')]"));
Select year=new Select(yearelement);
year.selectByValue("2023");


}}
