package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegativeTestCases {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void launchBrowser() {
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
	}
	
	public boolean doLogin(String username ,String password) {
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(username);
		
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		String warning=driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible")).getText();
		System.out.println("warning");
		
		if(warning.equals(" Warning: No match for E-Mail Address and/or Password")) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	@DataProvider
	public Object[][] getLoginNegativeData() {
		
		return new Object[][] {
			{"abcccccc@gmail.com", "testttt@123"},
			{"abcccccc1212@gmail.com", "testttt@123"},
			{"abc", "testttt@123"},
			{"testtttt@gmail.com", " "},
			{"testtttt@gmail.com", "testtttt"},
			{"#@#@#@#@gmail.com", "asdasdasd"},
			

		};
		
	}
	
		
		@Test(dataProvider="getLoginNegativeData")
		
		public void loginPagetest(String username,String password) {
			boolean flag=doLogin(username, password);
			Assert.assertTrue(flag);
		}
		
		
		@DataProvider
		
		public  Object[][] getRegPageData(){
			
			return new Object[][] {
				{"Heena", "Vaghela", "heena@gmail.com", "9090909098", "heena@123"},
				
				{"vinutha", "ravindra", "vinu@gmail.com", "9090909099", "vinu@123"},
				{"supriya", "bendukuri", "supriya@gmail.com", "9090909088", "sup@123"},
			};
			
			
		}
		
//		@Test(dataProvider="getRegTestData"Priority=2)
//		public void registerTest(String fn, String ln, String email, String phone, String password) {
//			System.out.println(fn + ln + email + phone + password);
//		}
		
		
		@AfterTest
		public void tearDown() {
			//driver.quit();
		}
	
	
	


}


