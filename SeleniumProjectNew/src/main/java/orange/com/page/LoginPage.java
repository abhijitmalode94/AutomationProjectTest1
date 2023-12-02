package orange.com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	//Password
	
	private By username=By.xpath("//input[@placeholder=\"Username\"]");
	private By password=By.xpath("//input[@placeholder=\"Password\"]");
	private By lgbtn=By.xpath("//button[@type=\"submit\"]");
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void doLogin() {
		driver.findElement(username).sendKeys("Admin");
		driver.findElement(password).sendKeys("admin123");
		
		driver.findElement(lgbtn).click();
	}
}
