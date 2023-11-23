package TestNg_session;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazoneTestWithBM {
	
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		System.out.println("Start");
		
	}
	
	@Test
	public void titleTest() {
		
		
		String title= driver.getTitle();
		System.out.println("Page title is --"+title);
		
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Assert.assertEquals(title, expectedTitle);
		
		
	}
	@Test
	public void searchTest() {
		boolean flag=driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		Assert.assertTrue(flag);
		
	}
	
	@Test
	public void helpDisplayed() {
		boolean flag=driver.findElement(By.linkText("Help")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	
	
	@AfterMethod
	public void teardown() {
		System.out.println("End");

		driver.quit();
	}


}
