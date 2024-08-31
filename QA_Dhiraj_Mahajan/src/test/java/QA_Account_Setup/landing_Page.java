package QA_Account_Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landing_Page {
	WebDriver driver;

	@FindBy(xpath="//a[text()='Create an Account']")
	WebElement btn_create_account;
	
	public landing_Page(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void ClickOnCreateAccountButton() {
		btn_create_account.click();
	}
	
	
}
