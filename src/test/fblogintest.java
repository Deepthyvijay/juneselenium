package test;

import org.openqa.selenium.WebDriver;


import org.testng.annotations.Test;


import Page.fbloginpage;
import basepkg.baseclass;

public class fblogintest extends baseclass
{

	WebDriver driver;
	
	@Test
	public void login() {
		
		fbloginpage ob=new fbloginpage(driver);
		ob.setvalues("abc@gmail.com", "deepu");
		ob.loginClick();
		driver.navigate().back();
	
	
	
		
		
				
				
				
				
				
				
				
				
	}				
	

}
