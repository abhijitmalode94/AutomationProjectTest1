package General_Pratice_daily;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutoSuggestion {
	
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("machine");
		
		Thread.sleep(3000);
		
		////li[@role="presentation"]//div[@class="wM6W7d"]/span
		
		//speed test
		
		List<WebElement> sugList=driver.findElements(By.xpath("//li[@role=\"presentation\"]//div[@class=\"wM6W7d\"]/span"));
		System.out.println(sugList.size());
		
		for(WebElement e:sugList) {
			String text=e.getText();
			System.out.println(text);
			
			if(text.contains("machine learning")) {
				e.click();
				break;
			}
		}
		
		
		
		
	

	}

}
