package TC01HomePgetest;

import org.testng.Assert;
import org.testng.annotations.Test;

import Testngutilities.RetryFailedTestCase;


public class TestRetry {
	@Test(retryAnalyzer=RetryFailedTestCase.class)
	public void firstmethod() {
	System.out.println("First Method");
	Assert.assertTrue(true);
	}

	@Test(retryAnalyzer=RetryFailedTestCase.class)
	public void secondMethod() {
		System.out.println("Second Method");	
		Assert.assertTrue(false);
	}
}
