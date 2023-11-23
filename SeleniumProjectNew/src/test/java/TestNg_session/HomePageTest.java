package TestNg_session;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {
	
	
	@BeforeSuite
	public void startDBConnection() {
		System.out.println("BS-startDBConnection");
	}
	

	@BeforeTest
	public void createUser() {
		System.out.println("BT-createUser");
	}
	

	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC-launchBrowser");
	}
	

	@BeforeMethod
	public void loginToapplicaion() {
		System.out.println("BM-loginToapplicaion");
	}
	
	
	@Test
	public void homePageTitleltest() {
		System.out.println("homePageTitleltest");
	}
	

	@Test
	public void homePageURLtest() {
		System.out.println("homePageURLtest");
	}
	

	@Test
	public void homePageSearchtest() {
		System.out.println("homePageSearchtest");
	}
	
	

	@AfterMethod
	public void logoutToApplication() {
		System.out.println("AM-logoutToApplication");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC-closeBrowser");
	}
	@AfterTest
	public void deleteUser() {
		System.out.println("AT-deleteUser");
	}
	
	@AfterSuite
	public void closeDbConnection() {
		System.out.println("AS-closeDbConnection");
	}

}
