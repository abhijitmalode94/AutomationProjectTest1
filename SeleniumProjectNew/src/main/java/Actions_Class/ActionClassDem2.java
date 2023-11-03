package Actions_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDem2 {
	
static WebDriver driver;
	
	public static void main(String[]args) throws InterruptedException {
		
		driver=new ChromeDriver();
		
		driver.get("https://www.browserstack.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("https://www.browserstack.com/");
		
		((JavascriptExecutor) driver).executeScript("scroll(0,300)");
		
		Actions actions=new Actions(driver);
		WebElement live=driver.findElement(By.linkText("live"));
		
		actions.moveToElement(live).build().perform();
		
		Thread.sleep(2000);
		
		WebElement automate=driver.findElement(By.className("\"product-cards-wrapper--click--hoverclick product-card-automate"));
		actions.moveToElement(automate).click().build().perform();
		
		
}
}
