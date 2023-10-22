package Firstpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//chromedriver
		//firefoxdriver
		//edgedriver
		
		ChromeDriver driver=new ChromeDriver();//browser launch
		driver.get("https://www.google.com");//open application
		//driver.close();
		String actualtitle=driver.getTitle();
		String exp="Google";
		if(actualtitle.equals(exp))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}

	}

}
