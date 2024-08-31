package QA_Account_stepdefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import QA_Account_Setup.create_new_account_page;
import QA_Account_Setup.landing_Page;
import QA_Account_Setup.verify_status_message;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class account_create_step {

	static WebDriver driver;
	landing_Page landingpage;
	create_new_account_page new_acc;
	verify_status_message verify;
	
	@Given("user is on the website landing page")
	public void user_is_on_the_website_landing_page() {

		driver= new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		
	
	}

	@When("user clicks on the Create an account button")
	public void user_clicks_on_the_create_an_account_button() {
		landingpage = new landing_Page(driver);
		landingpage.ClickOnCreateAccountButton();
	}

	@When("user enters {string} in the First Name field")
	public void user_enters_in_the_first_name_field(String firstname) {
	new_acc = new create_new_account_page(driver);
	new_acc.enterfirstname(firstname);
	
	
	}

	@When("user enters {string} in the Last Name field")
	public void user_enters_in_the_last_name_field(String lastname) {
		new_acc.enterlastname(lastname);
	
	}

	@When("user enters {string} in the Email field")
	public void user_enters_in_the_email_field(String email) {
		new_acc.enteremail(email);
	
	}

	@When("user enters {string} in the Password field")
	public void user_enters_in_the_password_field(String password) {
		new_acc.enterpassword(password);
	
	}

	@When("user enters {string} in the Confirm Password field")
	public void user_enters_in_the_confirm_password_field(String cnfpassword) {
		new_acc.cnfpassowrd(cnfpassword);
	
	}
	@When("user clicks on the submit Create an account button")
	public void user_clicks_on_the_submit_create_an_account_button() {
		
		new_acc.clickOnbutton();
		
		
	}

	@Then("user should see a confirmation message saying Your account has been created successfully.")
	public void user_should_see_a_confirmation_message_saying_your_account_has_been_created_successfully() {
		verify = new verify_status_message(driver);
		verify.verify_status();
	
	}

	@Then("close the broweser.")
	public void close_the_broweser() {
		driver.close();

	
	}

}
