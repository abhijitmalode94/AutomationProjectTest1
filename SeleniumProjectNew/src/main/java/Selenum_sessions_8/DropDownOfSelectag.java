package Selenum_sessions_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownOfSelectag {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		
		By country=By.id("Form_getForm_Country");
		
		WebElement CountrySelect=driver.findElement(country);
		// Create the object of select class and pass the ref as webelement
		
		Select select= new Select(CountrySelect);
		
		// Select By idex
		
		//select.selectByIndex(5);
		
		//select by values
		//select.selectByValue("American Samoa");
		
		//select by visisble text
		select.selectByVisibleText("Canada");
		
		
		

	}

}
