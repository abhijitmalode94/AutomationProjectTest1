package Selenum_sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyElementUtil {
	private WebDriver driver;
	
	public MyElementUtil(WebDriver driver) {
		
		this.driver = driver;
	}

	
	
	//create generic method to find the WebElemnt
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
		}
	
	//create the geneic method to perform the action on webelemet
	public void doSendkeys(By locator,String values) {
		getElement(locator).sendKeys(values);
	}
	
	

	//generic method
	public void doSearch(By SuggListLocator ,String suggName) {
		List<WebElement> suggList=driver.findElements(SuggListLocator);
		System.out.println(suggList.size());

		for(WebElement e:suggList) {
			String text=e.getText();
			System.out.println(text);
			
			if(text.contains(suggName)) {
				e.click();
				break;
			}
		}
	}
	
	
	
	

}
