package TestNg_session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegativeTestcases {
	
	
	public WebDriver driver;
	public boolean doLogin(String un, String pwd) {
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(un);
		
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(pwd);
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		String errormsg=driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible")).getText();
		System.out.println("error msg is==="+errormsg);
		if(errormsg.contains("Warning: No match for E-Mail Address and/or Password.")) {
			return true;
		}
		return false;
	
	}
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
	}
	
	@DataProvider
	public Object [][] getLoginNegativeData() {
		
		return new Object [][] {
			
			{"sdsge@gmail.com", "teysyg56598ygtht4#fhb"},
			{"sdsffbge@gmail.com", "teysyg565v841ffv98#fhb"},
			{"sdsvv65ge@gmail.com", "teysyg56g4h598#fhb"},
			{"sdsvfv6+6+ge@gmail.com", "teysyg559+56598#fhb"},
		};
	}
	
	//create the two holding parameter in given braket
	
	@Test(dataProvider="getLoginNegativeData")
	public void logintest(String un, String pwd) {
		
		boolean flag=doLogin(un, pwd);
		Assert.assertTrue(flag);
		
	}
	
	
	
	
//	@Test
//	public void logintest() {
//		Assert.assertTrue(doLogin("sdsge@gmail.com", "teysyg56598#fhb"));
//		
//		
//	}
	
	@AfterTest
	public void tearDown() {
		//driver.close();
		System.out.println("end");
	}

}
