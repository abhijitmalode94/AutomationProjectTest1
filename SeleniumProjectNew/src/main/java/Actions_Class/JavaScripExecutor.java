package Actions_Class;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScripExecutor {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		// scroll down
		js.executeScript("window.scrollBy(0,650)", "");
		
		//scroll up
		js.executeScript("window.scrollBy(0,-350)", "");
		
		
		
		
		
		
		
		

	}

}
