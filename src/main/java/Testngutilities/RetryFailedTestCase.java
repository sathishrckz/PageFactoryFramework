package Testngutilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTestCase implements IRetryAnalyzer {
	
	private int retrycount=0;
	private int retrymaxcount=2;
	public boolean retry(ITestResult result) {
		if(retrycount<retrymaxcount) {
			
			System.out.println("Retrying "+result.getName()+"again and the count is "+retrycount+1);
			retrycount++;
			return true;
		}
		
		return false;
	}                                                                       

}
