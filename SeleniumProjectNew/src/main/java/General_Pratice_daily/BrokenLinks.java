package General_Pratice_daily;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinks {

	static WebDriver driver;
	public static void main(String[] args){

//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");

		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		
		
		driver.get("https://www.amazon.in/");
		
	
		List<WebElement>listUrl=driver.findElements(By.tagName("a"));
		
		System.out.println("Total number of links"+listUrl.size());
		
		//List<String> url=new ArrayList<String>();
		
		for(WebElement e:listUrl) {
			String url=e.getAttribute("herf");
			//url.add(urlist);
			
			checktBrokenLinks(url);
			
		}
		
	
		driver.close();
	
	}
	
	
	public static void checktBrokenLinks(String url) {
		try {
			
			URL link=new URL(url);
			HttpURLConnection httpUrlConnection=(HttpURLConnection) link.openConnection();
			httpUrlConnection.setConnectTimeout(5000);
			httpUrlConnection.connect();
			
			if(httpUrlConnection.getResponseCode() >=400) {
				System.out.println(url+"---->"+httpUrlConnection.getResponseMessage()+"is a broken link");
			}
			else {
				System.out.println(url+"---->"+httpUrlConnection.getResponseMessage()+"it is not a broken link");
			}
		}
		catch(Exception e)
		{
			System.out.println(url + " - " + "is a broken link");
		}
	}

}
