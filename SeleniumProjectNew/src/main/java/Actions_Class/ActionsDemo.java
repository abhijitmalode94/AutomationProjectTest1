package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
	
	static WebDriver driver;
	
	public static void main(String[]args) {
		
		driver=new ChromeDriver();
		
		driver.get("https://www.browserstack.com");
		
		Actions action=new Actions(driver);
		
		WebElement elemet=driver.findElement(By.linkText("Get started free"));
		action.moveToElement(elemet).click().perform();
		
		driver.quit();
		
		
	}

}
