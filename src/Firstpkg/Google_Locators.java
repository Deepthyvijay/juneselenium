package Firstpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://google.com");
		//driver.findElement(By.id("APjFqb")).sendKeys("flipkart");
		driver.findElement(By.name("q")).sendKeys("flipkart",Keys.ENTER);
		
	}

}
