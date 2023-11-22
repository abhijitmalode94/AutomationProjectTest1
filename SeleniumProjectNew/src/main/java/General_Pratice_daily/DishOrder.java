package General_Pratice_daily;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DishOrder {

	
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		driver.get(null);
		
		List<WebElement> dish=driver.findElements(By.tagName("//ul/li"));
		
		System.out.println(dish.size());
		
		List<String> dishprice=new ArrayList<String>();
		
		for(WebElement e:dish) {
			String price=e.getText();
			dishprice.add(price);
			Collections.sort(dishprice,Collections.reverseOrder());
			//// Sort the price  in the decending order
			System.out.println("Dish price is"+dishprice);
			
			
		}
		
		
	}

}
