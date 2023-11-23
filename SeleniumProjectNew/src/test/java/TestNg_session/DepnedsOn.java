package TestNg_session;

import org.testng.annotations.Test;

public class DepnedsOn {
	@Test(dependsOnMethods= {"test2"})
	public void test1() {
		System.out.println("Test 1");
	}
	@Test(dependsOnMethods= {"test3"})
	public void test2() {
		System.out.println("Test 2");
	}
	
	@Test
	public void test3() {
		System.out.println("Test 3");
	}
	
	

}
