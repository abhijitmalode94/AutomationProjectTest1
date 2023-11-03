package Selenum_sessions;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {

	
	static WebDriver driver;


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	
		
//		Boolean IsSearchdis=driver.findElement(By.name("search")).isDisplayed();
//		System.out.println(IsSearchdis);
//		if(IsSearchdis) System.out.println("Pass");
//		driver.findElement(By.name("search")).sendKeys("Mackbook");
		
		By search=By.name("search");
		By btn=By.xpath("//*[@id=\"search\"]/span/button");
		
		getElemet(search);
		doElementIsDisplayed(search);
		doSendkeys(search, "iphone");
		doClick(btn);

	}
	

	public static  WebElement getElemet(By locator) {
		return driver.findElement(locator);
	}
	
	public static boolean doElementIsDisplayed(By locator) {
		return getElemet(locator).isDisplayed();
	}
	
	public static  void doSendkeys(By locator, String values) {
		getElemet(locator).sendKeys(values);
		
	}
	public static void doClick(By locator) {
		
		getElemet(locator).click();
		
	}
	
	
	

}
