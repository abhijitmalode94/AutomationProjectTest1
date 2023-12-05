package Session13;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterSectionConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
//		List<WebElement> listofootersection=
//				driver.findElements(By.xpath("//h5[text()='Information']//following-sibling::ul//a"));
//		
//		System.out.println(listofootersection.size());
//		
//		List<String> listsectionValues=new ArrayList<String>();
//		
//		for(WebElement e:listofootersection) {
//		
//			String text=e.getText();
//			listsectionValues.add(text);
//			System.out.println(listsectionValues);
		
		List<String> infolist=getFooterSectionList("Information");
		System.out.println(infolist);
		
		List<String> CustomerServicelist=getFooterSectionList("Customer Service");
		System.out.println(CustomerServicelist);
		
		List<String> Extraslist=getFooterSectionList("Extras");
		System.out.println(Extraslist);
		
		List<String> MyAccountlist=getFooterSectionList("My Account");
		System.out.println(MyAccountlist);
		
		
		}
	
	public static List<String> getFooterSectionList(String sectionName) {
		
		List<WebElement> listofootersection=
				driver.findElements(By.xpath("//h5[text()='"+sectionName+"']//following-sibling::ul//a"));
		
		System.out.println(listofootersection.size());
		
		List<String> listsectionValues=new ArrayList<String>();
		
		for(WebElement e:listofootersection) {
		
			String text=e.getText();
			listsectionValues.add(text);
			
		}
		return listsectionValues;
		
	}
	
	

	}
	
	


