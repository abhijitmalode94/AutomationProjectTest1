package Selenum_sessions_8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownWithoutSelectMtd {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		
		List<WebElement> optionList=driver.findElements(By.xpath("//select[@id=\"Form_getForm_Country\"]/option"));
		
		System.out.println(optionList.size());
		
		//Select select= new Select((WebElement) optionList);
		
		for(WebElement e:optionList) {
			 String text=e.getText();
			 System.out.println(text);
			 if(text.equals("India")) {
				 e.click();
				 break;
			 }
		}
		
		
		
	}

}
