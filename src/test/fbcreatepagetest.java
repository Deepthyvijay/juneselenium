package test;

import org.testng.annotations.Test;


import Page.Fbcreatepage;
import basepkg.baseclass;

public class fbcreatepagetest extends baseclass {
	
	@Test
	public void createpage()
	{
		Fbcreatepage ob1= new Fbcreatepage(driver);
		ob1.createPageLinkClick();
		ob1.getStartedButtonClick();
		
	}

}
