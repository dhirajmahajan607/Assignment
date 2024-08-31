package QA_Account_Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class create_new_account_page {
	WebDriver driver;
	
	@FindBy(xpath ="//input[@id='firstname']") 
	WebElement txt_firstname;
	@FindBy(xpath ="//input[@id='lastname']") 
	WebElement txt_lastname;
	@FindBy(id = "email_address") 
	WebElement txt_email;
	@FindBy(xpath = "//input[@id='password']") 
	WebElement txt_password;
	@FindBy(xpath ="//input[@id='password-confirmation']") 
	WebElement txt_confirmpassword;
	@FindBy(xpath = "//button[@title='Create an Account']//span[contains(text(),'Create an Account')]")
	WebElement btn_submit;
	
	public create_new_account_page(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	
}
	public void enterfirstname(String firstname) {
		txt_firstname.sendKeys(firstname);
	}
	
	public void enterlastname(String lastname) {
		txt_lastname.sendKeys(lastname);
	}
	public void enteremail(String email) {
		txt_email.sendKeys(email);
	}
	public void enterpassword(String password) {
		txt_password.sendKeys(password);
	}
	public void cnfpassowrd(String cnfpassword) {
		txt_confirmpassword.sendKeys(cnfpassword);
	}
	
	public void clickOnbutton() {
		btn_submit.click();
	}
}
