package General_Pratice_daily;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValiMobileNum {
	

	static WebDriver driver;
	
	@BeforeTest
	public void lauchbrowswe() {
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.airtel.in/");
	}
		@Test
		public void homePagetest() {
			
			String title=driver.getTitle();
			System.out.println(title);
			Assert.assertEquals(title, "Airtel: Prepaid, Postpaid, Broadband, DTH, Bank & Business");
			
			
		}
  
	
	
}
