package Resource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;


public class Base {

	public WebDriver driver;

//	public WebDriver InvokeDriver(WebDriver driver) {
//
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		return driver;
//
//	}
	
	@BeforeClass
	public void start() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tuberanker.com/youtube-hashtag-generator");
	}

	@AfterSuite
	public void Close() {
		driver.quit();
	}
}
