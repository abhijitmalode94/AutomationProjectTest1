package Selenum_sessions_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropDownAllElement {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		
		By country=By.id("Form_getForm_Country");

	}

}
