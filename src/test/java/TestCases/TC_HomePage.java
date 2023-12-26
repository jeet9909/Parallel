package TestCases;

import org.testng.annotations.Test;

import Page_Obj.Home_Page;
import Resource.Base;

public class TC_HomePage extends Base {

	
	
	@Test
	public void TC_Home_Page() throws InterruptedException {
		
		Home_Page hp = new Home_Page(driver);
		
		hp.Click_Event("Valorant Montage");
		Thread.sleep(5000);
		
	}
	
 
}
