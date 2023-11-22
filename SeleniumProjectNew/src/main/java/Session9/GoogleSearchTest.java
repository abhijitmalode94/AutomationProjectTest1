package Session9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Test");
		Thread.sleep(3000);
		
		//create the generic method 
		
		By googleSuggListLocator=By.xpath("//li[@role=\"presentation\"]//div[@class=\"wM6W7d\"]/span");
		////li[@role="presentation"]//div[@class="wM6W7d"]/span
		
		doSearch(googleSuggListLocator,"test speed");
		
	}
		
		//generic method
		public static void doSearch(By SuggListLocator ,String sugName) {
			List<WebElement> suggList=driver.findElements(SuggListLocator);
			System.out.println(suggList.size());

			for(WebElement e:suggList) {
				String text=e.getText();
				System.out.println(text);
				
				if(text.contains(sugName)) {
					e.click();
					break;
				}
			}
		}
			
	
//		normal method
//		
//    	List<WebElement> suggList=driver.findElements(By.xpath("//li[@role=\"presentation\"]//div[@class=\"wM6W7d\"]/span"));
//		System.out.println(suggList.size());
//		
//		for(WebElement e:suggList) {
//			String text=e.getText();
//			System.out.println(text);
//			
//			if(text.contains("test speed")) {
//				e.click();
//				break;
//			}
//		}
//		
//	
//		
//		
//	}
}


