package TestNg_session;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkippedExample {
	
	
	@Test
	public void demo1() {
		System.out.println("This is demo1 test mthod");
	}
	
	@Test(enabled=false)
	public void testCaseEnabling(){
			System.out.println("I'm Not Ready, please don't execute me");
		}
	@Test
	public void testCaseSkipException(){
			System.out.println("Im in skip exception");
			throw new SkipException("Skipping this exception");
		}

	@Test
	public void testCaseConditionalSkipException(){
		System.out.println("Im in Conditional Skip");
		boolean DataAvailable = false;
		if(!DataAvailable)
		throw new SkipException("Skipping this exception");
		System.out.println("Executed Successfully");
	}

}
