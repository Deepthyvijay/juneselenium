package Firstpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
driver.findElement(By.id("email")).sendKeys("Deepthy@gmail.com");
driver.findElement(By.id("pass")).sendKeys("Deepu");
driver.findElement(By.name("login")).click();
	}

}
