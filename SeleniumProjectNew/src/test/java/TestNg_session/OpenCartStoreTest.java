package TestNg_session;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartStoreTest {
	
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
	}
	
	@Test
	public void titleTest() {
		
		String title= driver.getTitle();
		System.out.println("Page title is --"+title);
		Assert.assertEquals(title, "Your Store");
		
		
		
	}
	@Test
	public void searchTest() {
		boolean flag=driver.findElement(By.name("search")).isDisplayed();
		Assert.assertTrue(flag);
		
	}
	
		
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
