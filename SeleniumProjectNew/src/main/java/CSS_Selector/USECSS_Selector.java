package CSS_Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class USECSS_Selector {
	
	

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement lgbBtn=driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("document.getElementById('id').value='input-email'");
		

}
}
