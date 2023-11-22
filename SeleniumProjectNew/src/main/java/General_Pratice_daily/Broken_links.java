package General_Pratice_daily;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_links {
//	
//	Use the following steps to identify broken links in Selenium
//
//	Use <a> tag to fetch all the links present on a web page
//	Send HTTP request for the link
//	Verify the HTTP response code for the link
//	Determine if the link is valid or it is broken based on the HTTP response code
//	Repeat the process for all links captured with the first step
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();


		// Navigate to BStackDemo Website
		driver.get("https://rahulshettyacademy.com/seleniumPractise");


		// Finding all the available links on webpage
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());


		// Iterating each link and checking the response status
		for (WebElement link : links) {
		String url = link.getAttribute("href");
		verifyLink(url);
		}


		driver.quit();
		}


		public static void verifyLink(String url) {
		try {
		URL link = new URL(url);
		HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
		httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
		httpURLConnection.connect();


		if (httpURLConnection.getResponseCode() == 200) {
		System.out.println(url + " - " + httpURLConnection.getResponseMessage());
		} else {
		System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
		}
		} catch (Exception e) {
		System.out.println(url + " - " + "is a broken link");
		}
		}
		}



