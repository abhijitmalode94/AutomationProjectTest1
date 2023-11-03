package testngsessions;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest {
	
	WebDriver driver;
	
	//Home page Test

	@BeforeMethod
	public void Setup() {
		
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
	}
		@Test(priority=1)
		public void VerifyPageTitle() {
			String ActTitle=driver.getTitle();
				System.out.println("Title of app is ="+ActTitle);
				Assert.assertEquals(ActTitle, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		}
				
		@Test(priority=3)
		public void VerfySerachFiled() {
			
			Boolean SearchDisplayed=driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
			
			Assert.assertTrue(SearchDisplayed);	
		}
		
		@Test(priority=2)
		public void VerfyHelpFiled() {
			
			Boolean help=driver.findElement(By.linkText("Help")).isDisplayed();
			Assert.assertTrue(help);	
		}
				
			
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
		
}


