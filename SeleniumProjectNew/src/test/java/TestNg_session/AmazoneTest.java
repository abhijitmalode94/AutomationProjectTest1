package TestNg_session;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazoneTest extends MyBaseTest{
	
	
	
	@Test(priority=1)
	public void titleTest() {
		String title= driver.getTitle();
		System.out.println("Page title is --"+title);
		
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Assert.assertEquals(title, expectedTitle);
		
		
	}
	@Test(priority=2)
	public void searchTest() {
		boolean flag=driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		Assert.assertTrue(flag);
		
	}
	
	@Test(priority=3)
	public void helpDisplayed() {
		boolean flag=driver.findElement(By.linkText("Help")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	
	
}
