package TestCases;

import org.testng.annotations.Test;

import Page_Obj.Instagram;
import Resource.Base;

public class TC_GMail extends Base{

	
	@Test
	public void TC_TestCase() throws InterruptedException {
		
		Instagram ig = new Instagram(driver);
		
		ig.Click_Event("demo");
		Thread.sleep(5000);
	}
	
	
	
}
