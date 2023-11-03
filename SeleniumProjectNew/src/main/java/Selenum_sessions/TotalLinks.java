package Selenum_sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// Find all links
		//Count of all link
		//print all links
	    driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		// Find all links
		
	List<WebElement> all_links_List=driver.findElements(By.tagName("a"));
	//we use tagname here beause the anchor tag a is same for all tag
	
	//Count of all link
	int toal_LinkCount=all_links_List.size();
	System.out.println("Count of all links= "+toal_LinkCount);
	
	//print all links
//	for(int i=0;i<toal_LinkCount;i++) {
//		
//		String Text=all_links_List.get(i).getText();
//		System.out.println(Text);
//		
//		
//		
//	}
	
	int count=0;
	for(WebElement e :all_links_List) {
		
		String Text=e.getText();
		if(Text.length()>0) {
			System.out.println(count+" " +Text);
		}
		count++;
		
		
		
	}
		
		
	}

}
