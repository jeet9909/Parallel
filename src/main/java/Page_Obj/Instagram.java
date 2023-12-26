package Page_Obj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Instagram {

	
	private WebDriver driver;


	public Instagram(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	
	@FindBy(xpath = "//input[@id='search-input']")
	WebElement Enter_Value;
	
	
	public void Click_Event(String Enter_Data) {
		
		
		Enter_Value.sendKeys(Enter_Data);
	}
}
