package TestNg_session;

import java.io.File;
import java.time.Duration;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUpload {
	
	
	

	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
	}	
		@Test
		public void fileUpload() {
			
			File uploadFile = new File("C:\\Users\\LENOVO\\Desktop\\CM Resume\\pppppp.jpg");

		    WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));
		    fileInput.sendKeys(uploadFile.getAbsolutePath());
		    driver.findElement(By.id("file-submit")).click();

		    WebElement fileName = driver.findElement(By.id("uploaded-files"));
		    
		
		    
		    Assert.assertEquals("pppppp.jpg", fileName.getText());
		    
		   
		


}
}

