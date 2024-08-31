package QA_Account_Setup;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class verify_status_message {
	WebDriver driver;
	
	@FindBy(xpath  = "//*[text()= 'Thank you for registering with Main Website Store.']") WebElement message_success;
	
	public verify_status_message(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void verify_status() {
		String message_actual = message_success.getText();
		String message_expected= "Thank you for registering with Main Website Store.";

		Assert.assertEquals(message_actual, message_expected);
	}
	
	

}
