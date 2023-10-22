package testngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Marinerspage {
	
	WebDriver driver;
	
	@FindBy(xpath=("/html/body/div/div/div[2]/section/div[1]/form/div[2]/div[1]/div/div[1]/div/div/div/div/input"))
    WebElement from;
	
	@FindBy (xpath=("/html/body/div/div/div[2]/section/div[1]/form/div[2]/div[1]/div/div[2]/div/div/div/div/input"))
	WebElement To;
	
	@FindBy(xpath=("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[2]/div[2]/div/div/div/button/svg"))
    WebElement calendericon;
	
	@FindBy(xpath=("/html/body/div[2]/div[2]/div/div/div/div[1]/div[1]/button/svg"))
	WebElement yeardropdownicon;
	
	@FindBy(xpath=("/html/body/div[2]/div[2]/div/div/div/div[2]/div/div/div[125]/button"))
	WebElement year2024;
	
	@FindBy(xpath=("/html/body/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div[4]/div[7]/button"))
	WebElement October26;
	
	@FindBy(xpath=("/html/body/div[2]/div[2]/div/div/div/div[1]/div[1]/div[2]/div"))
	WebElement datepickeryeartext;
	
	@FindBy(xpath=("/html/body/div[2]/div[2]/div/div/div/div[1]/div[1]/div[1]/div"))
	WebElement datepickermonthtext;
	
	@FindBy(xpath=("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/div"))
	WebElement travellersdetails;
	
	@FindBy(xpath=("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/ul/li[1]/div/div/div[3]"))
	WebElement adult;
	
	@FindBy(xpath=("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/ul/li[2]/div/div/div[3]"))
	WebElement child;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/ul/li[4]/div/div[1]/fieldset/div/label[2]/span[1]/span[1]/input")
	WebElement Businessclass;
	
	@FindBy(xpath=("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/ul/li[4]/div/div[2]/span"))
	WebElement classdone;
	
	@FindBy(xpath=("//input[@class=\"btn\")"))
	WebElement search;
	
	public Marinerspage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void selectFromTo(WebElement to)throws Exception
	{
		from.click();
		Thread.sleep(800);
		from.clear();
		Thread.sleep(800);
		from.sendKeys("Bangalore, India");
		Thread.sleep(800);
		
		to.click();
		Thread.sleep(800);
		to.clear();
		Thread.sleep(800);
		to.sendKeys("Pune, India");
		Thread.sleep(800);
	}
	public void selectDate_datepicker()
	{
		calendericon.click();
		while(true)
		{
			String yeartext=datepickeryeartext.getText();
			System.out.println("year : "+yeartext);
			if(yeartext.equals("2024"))
			{
				System.out.println("year 2024 is selected");
				break;
			}
			else
			{
				yeardropdownicon.click();
				year2024.click();
			}
			
			String monthtext=datepickermonthtext.getText();
			System.out.println("month:"+monthtext);
			if(monthtext.equals("october"))
			{
				October26.click();
				System.out.println("October is selected");
			}}}
		
		//================OR===================================
			public void selectDate() throws Exception
			{
				calendericon.click();
				Thread.sleep(800);
				
				yeardropdownicon.click();
				Thread.sleep(800);
				
				
				year2024.click();
				Thread.sleep(800);
				
				October26.click();
				Thread.sleep(800);
			}
			//======================================================
		public void selectTravellernClass() throws Exception
		{
			travellersdetails.click();
			Thread.sleep(800);
			
			adult.click();
			Thread.sleep(800);
			
			child.click();
			Thread.sleep(800);
			
			Businessclass.click();
			Thread.sleep(800);
			
			classdone.click();
			Thread.sleep(800);
		}
		
		public void SelectSearch() throws InterruptedException
		{
			search.click();
		}
}
