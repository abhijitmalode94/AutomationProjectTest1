package Selenum_sessions_10;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrickInfoTable {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.espncricinfo.com/series/icc-cricket-world-cup-2023-24-1367856/england-vs-netherlands-40th-match-1384431/full-scorecard");
		
		Thread.sleep(2000);
		
		//for wcktkeeper name
		
//		WebElement wctkeep=driver.findElement(By.xpath("//span[text()='Dawid Malan']/ancestor::td/following-sibling::td/span/span"));
//		System.out.println(wctkeep.getText());
		
		// for score of the criketer
		
		
		
		String WctName=getCricketweeketKeeperName("Moeen Ali");
		System.out.println(WctName);
		
		 List<String> scoreList=getScoreCard("Chris Woakes");
		 System.out.println(scoreList);
		
		
		
		driver.close();
		
		
}
	
	//generic method for crick info webtable
	
	public static String getCricketweeketKeeperName(String BastManName) {
		
		return driver.findElement(By.xpath("//span[text()='"+BastManName+"']/ancestor::td/following-sibling::td/span/span")).getText();
				
		
	}
	////span[text()='Chris Woakes']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]
	
	public static List<String> getScoreCard(String playername) {
		List<WebElement> scorelist=driver.findElements(By.xpath("//span[text()='"+playername+"']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
		
		List<String> playerscorecard=new ArrayList<String>();
		
		for(WebElement e:scorelist) {
			String text=e.getText();
			playerscorecard.add(text);
		
		}
		
		return playerscorecard;
	}
	
	

	
	
	
}
