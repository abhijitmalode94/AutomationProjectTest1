package Selenum_sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class Locators_In_Selenium {

	public static void main(String[] args) {
	
		WebDriver driver;
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//1.id
		
		//2.name
		
	driver.findElement(By.name("email")).sendKeys("Abhijit@gmail.com");
	
	By emaiID=By.name("Abhijit@gmail.com");
	
	//3.Class name-
	
	//6.LinkText
	

	}

}
