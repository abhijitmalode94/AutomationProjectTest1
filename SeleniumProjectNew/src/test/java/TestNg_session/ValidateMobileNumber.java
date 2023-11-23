package TestNg_session;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValidateMobileNumber {
	
	
	 WebDriver driver;
	
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
	    
	    
	    ////label[@class='wt-typography wt-input--hint']
	    
	    
	    @Test
	    public void validateMobileNumber() throws InterruptedException {
	    	
	    	driver.findElement(By.id("rechargeInput")).sendKeys("12586");
	    	
	    	Thread.sleep(5000);
	    	
	    	String message=driver.findElement(By.xpath("//label[@class='wt-typography wt-input--hint']")).getText();
	    	
	    	System.out.println(message);
	    	
	    	Assert.assertEquals(message,"Please enter a valid mobile number.");
	    	System.out.println("test case failed");
	    	
	    }
	    
	    
	    @AfterTest
	    public void teardown() {
	    	
	    	driver.close();
	    	
	    }
		
	}

