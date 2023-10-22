package testngpackage;


	
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Grouping {

		//@beforesuite
		//@beforeTest
		//@beforeclass
		//@beforemethod
		//@test
		//@aftermethod
		//@afterclass
		//@aftertest
		//@aftersuite
		
		
		@BeforeTest
		public void Setup()
		{
			System.out.println("Browser open");
		}
		@BeforeMethod
		public void urlloading()
		{
			System.out.println("url details");
		}
		@Test(groups= {"smoke","sanity"})
		public void test1()
		{
			System.out.println("test1");
		}
		
		
		@Test(groups={"smoke"})
		public void test2()
		{
			System.out.println("test2");
		}
		
		
	    @Test(groups= {"regression"})
		public void test3()
		{
			System.out.println("test3");
		}
	    @Test(groups= {"sanity"})
		public void test4()
		{
			System.out.println("test4");
		}

		
		@AfterMethod
		public void methodclose()
		{
			System.out.println("aftermethod");
			
		}
		@AfterTest
		public void tearDown()
		{
			System.out.println("browser close");
		}
		
		

}
