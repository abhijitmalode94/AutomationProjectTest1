package Selenum_sessions_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWeBTable {

	
	static WebDriver driver;
	public static void main(String[] args) {
		

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		
		int headercount=getHeaderCount();
		System.out.println(headercount);
		
		int rowCount=getRowCount();
		System.out.println(rowCount);
		
		//table[@id="customers"]/tbody/tr[7]/td[1]
		//table[@id="customers"]/tbody/tr[2]/td[1]
		//table[@id="customers"]/tbody/tr[3]/td[1]
		//table[@id="customers"]/tbody/tr[4]/td[1]
		
		// first berak the xpath into 2 parts
		
		String beforeXpath="//table[@id=\"customers\"]/tbody/tr[";
		String AfteXpath="]/td[1]";
		
		for (int row=2;row<=7;row++) {
			String xptah=beforeXpath+row+AfteXpath;
			System.out.println(xptah);
		String empname=driver.findElement(By.xpath("xptah")).getText();
			System.out.println(empname);
			
		}
				
				
				
		
		
		
		
		
		driver.quit();
		
	}
	
	//table[@id="customers"]//th
	// COUNT TOTAL NUMBER OF HEADER or column count
	
	public static int getHeaderCount() {
		
		return driver.findElements(By.xpath("//table[@id=\"customers\"]//th")).size();
	}
	//get table row count
	public static int getRowCount() {
		
		return driver.findElements(By.xpath("//table[@id=\"customers\"]//tr")).size()-1;
	}
		
}
