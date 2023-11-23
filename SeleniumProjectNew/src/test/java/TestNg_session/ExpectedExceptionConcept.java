package TestNg_session;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	@Test(expectedExceptions=Exception.class)
	 public void testdemo() {
		System.out.println("demotest");
		int i=9/0;
	}

}
