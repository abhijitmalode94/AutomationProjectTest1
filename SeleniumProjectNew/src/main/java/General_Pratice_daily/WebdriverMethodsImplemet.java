package General_Pratice_daily;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethodsImplemet {
	
	static WebDriver driver;
	
	public static void main(String[]arg) throws InterruptedException {
		

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		Thread.sleep(2000);
	
		//current url of web
	String Actual_Url=driver.getCurrentUrl();
	System.out.println("Url of the page is"+Actual_Url);
	if(Actual_Url.equals("https://rahulshettyacademy.com/seleniumPractise/#/")) {
		System.out.println("Test is pass");
	}
	else {
		System.out.println("test is fail");
	}
	
	//get tite of the page
	
	String  title= driver.getTitle();
	System.out.println("Title of the page is"+title);
	if(title.equals("GreenKart - veg and fruits kart")) {
		System.out.println("Test case is pass");
	}
	else
	{
		System.out.println("Test case is fail");
	}
	
	//get the text 
	String text=driver.findElement(By.xpath("//div[contains(@class,'brand greenLogo')]")).getText();
	System.out.println(text);
	
	Boolean addtocart=driver.findElement(By.xpath("//img[contains(@alt,'Cart')]")).isDisplayed();
	System.out.println(addtocart);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		driver.close();
	
	}

}
