package Firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttontextverification {
	
	ChromeDriver driver;
	private Object buttontext;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test1()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).getAttribute("value");
if(buttontext.equals("check availability"))
{
	System.out.println("pass");
}
else
{
	System.out.println("fail");
}
}}
