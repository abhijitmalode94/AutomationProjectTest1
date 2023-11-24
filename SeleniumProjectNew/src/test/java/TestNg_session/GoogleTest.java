package TestNg_session;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends MyBaseTest {
	

	
	@Test(priority=1)
	public void titleTest() {
		String title= driver.getTitle();
		System.out.println("Page title is --"+title);
		
		
		
	}
	@Test(priority=2)
	public void searchTest() {
		boolean flag=driver.findElement(By.id("APjFqb")).isDisplayed();
		Assert.assertTrue(flag);
		
	}
	
		
	

}
