package testngpackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven_FB {
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https:\\www.facebook.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test()throws IOException
	{
		FileInputStream f=new FileInputStream("C:\\Users\\deept\\OneDrive\\Desktop\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);//workbook
		XSSFSheet sh=wb.getSheet("Sheet1");//locating the sheet in the workbook
		
		int row=sh.getLastRowNum();//to get row details
		for (int i=1;i<=row;i++)//since 1st row and column is headings we dont have to fetch that details so begin with i=1 not i=0
		{
			String email=sh.getRow(i).getCell(0).getStringCellValue();//accessing values in row1 &column0 and saving it to email
			System.out.println("email="+email);
			String password=sh.getRow(i).getCell(1).getStringCellValue();//accessing values in row1 &column1 and saving it to password
			System.out.println("password="+password);
			driver.findElement(By.name("email")).sendKeys(email);
			driver.findElement(By.name("pass")).sendKeys(password);
			driver.findElement(By.name("login")).click();
			driver.navigate().refresh();
			
		
			
		}
		
	}

}
