package Actions_Class;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	static WebDriver driver;
public static void main(String[]args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> windowsID=driver.getWindowHandles();//return the Id of multiple browser window
		
		//set dupl is not allowed
		
		//1.by using iterator method
//		java.util.Iterator<String> it=windowsID.iterator();
//		
//		String PraentWindowId=it.next();
//		String childwindowID=it.next();
//		System.out.println("PraentWindowId"+PraentWindowId);
//		System.out.println("childwindowID"+childwindowID);
		
		
		//2.by using array list/ArrayList
		
//		List<String> windowIdlist=new ArrayList(windowsID);//convert theset into list
//		
//		String PraentWindowId=windowIdlist.get(0);
//		String childwindowID=windowIdlist.get(1);
//		System.out.println("PraentWindowId"+PraentWindowId);
//		System.out.println("childwindowID"+childwindowID);
//		
//		//how to used window ids for switching purpose
//		
//		driver.switchTo().window(PraentWindowId);
//		
//		System.out.println("Get the title of parent windo"+driver.getTitle());
//		
//		driver.switchTo().window(childwindowID);
//		System.out.println("Get the title of child windo"+driver.getTitle());
//		
//		driver.findElement(By.linkText("Contact Sales")).click();
//		
		
		
		//for reach loop
		for(String e:windowsID) {
			String windowtitle=driver.switchTo().window(e).getTitle();
			System.out.println(windowtitle);
		}
		
		//driver.close();//close mtd close single browser window,on which driver is poining to the 
		
		//driver.quit();// quite mtd close all the browser window
		
		
		//want to close specific browser window
		
		for(String e:windowsID) {
			String windowtitle=driver.switchTo().window(e).getTitle();
			if(windowtitle.equals("OrangeHRM")) {
				driver.close();
			}
		}
		
		
		
		
		
}
}
