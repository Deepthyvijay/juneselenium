package Firstpkg;

import java.io.File;
import java.io.IOException;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotpgm {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test1() throws IOException
	{
		driver.get("https://www.facebook.com");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//Fullpage screenshot code
		FileHandler.copy(src, new File("C:\\Screenshot//Screenshot.png"));//Storing screenshot in pc drive, applicable for both pagesc and elementsc
		
		WebElement searchbutton=driver.findElement(By.name("login"));//element screenshot code
		File elementscreenshot=searchbutton.getScreenshotAs(OutputType.FILE);//element screenshot code
		FileHandler.copy(elementscreenshot,new File("./Screenshot/searchbutton.png"));//storing screenshot in java package,applicable for both pagesc and elementsc
		
		
		

}}
