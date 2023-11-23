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

public class TestngSession {
	
	@BeforeSuite
	public void StartDbConnection() {
		System.out.println("Brfore Method");
	}
	
	@BeforeTest
	public void CreateNewuser() {
		System.out.println("Brfore Test");
	}
	@BeforeClass
	public void LauchtheBrowswer()
	{
		System.out.println("Brfore Class");
	}
	@BeforeMethod
	public void LoginTOapp() {
		System.out.println("Before method");
	}
	
	
	@Test
	public void homePageTitleTest() {
		System.out.println("homePageTitleTest");
	}

	//11
	@Test
	public void homePageURLTest() {
		System.out.println("homePageURLTest");
	}

	//5
	@Test
	public void homePageSearchTest() {
		System.out.println("homePageSearchTest");
	}
	
	@AfterMethod
	public void Logout() {
		System.out.println("Brfore Method");
	}
	
	@AfterClass
	public void CloaseBrowser() {
		System.out.println("Brfore Method");
	}
	@AfterTest
	public void CloseDB() {
		System.out.println("Brfore Method");
	}
	@AfterSuite
	public void  ShutDownAplln() {
		System.out.println("Brfore Method");
	}
	
	
	
	
}
