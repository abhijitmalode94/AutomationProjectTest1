package Session9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLangLink {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		List<WebElement> langList = driver.findElements(By.xpath("//div[@id=\"SIvCob\"]/a"));

		System.out.println(langList.size());

		for (WebElement e : langList) {
			String text = e.getText();
			System.out.println(text);// Getting all the text
			// click on the specific langlink

			if (text.equals("मराठी")) {
				e.click();
				break;
			}

		}
		
		//Assignment
		//Create the generic method
//		1.click on specific lang list
//		2.return the list of lang link
		
		//3.Create the method and capture the list of google footer link
		
		

	}
}
