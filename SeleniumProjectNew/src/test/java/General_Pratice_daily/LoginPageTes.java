package General_Pratice_daily;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import orange.com.page.LoginPage;

public class LoginPageTes {
	
	WebDriver driver;
	LoginPage lp;
	
	@BeforeTest
	public void setup() throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@Test(priority=1)
	public void login() {
		
		LoginPage lp=new LoginPage(driver);
		
		lp.doLogin();
			
		}
		
		
	
	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
	}
	
	
	

}
