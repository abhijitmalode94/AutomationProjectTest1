package Selenum_sessions_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Handles {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://classic.freecrm.com/");
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("amalode94");
		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Abhi@23794");
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		
		Thread.sleep(3000);
		// we have to click on the contacts but it is available under thge frame so before
		// clicking on it we have switch to frame
		
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		
		//driver.findElement(By.xpath("//a[text()='Abhijit Malode']/parent::td/preceding-sibling::td/input[@type=\"checkbox\"]")).click();
		selectUser("Abhijit Malode");
		//we are creatimg generic method so here we need to change name only
		
		String Cname=getuserCompanyname("Abhijit Malode");
		System.out.println(Cname);
		
	}
	
	public static void selectUser(String username) {
		
		driver.findElement(By.xpath("//a[text()='"+username+"']/parent::td/preceding-sibling::td/input[@type=\"checkbox\"]")).click();
		

}
////a[text()='Abhijit Malode']/parent::td/following-sibling::td/a[@context="company"]
	public static String getuserCompanyname(String username) {
		
		return driver.findElement(By.xpath("//a[text()='"+username+"']/parent::td/following-sibling::td/a[@context=\"company\"]")).getText();
	
}
}
