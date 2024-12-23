package stepDefinations;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStep {
	private static String acTitle;
	private static String title ;
	private LoginPage loginPage =new LoginPage(DriverFactory.getDriver());

	@Given("user is on login page")
	public void user_is_on_login_page() {
	 DriverFactory.getDriver()
	 			.get("http://automationpractice.pl/index.php?controller=authentication&back=my-account");
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		  title = loginPage.getLoginPageTitle();
		  System.out.println("This is the Actual title "+ title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String ExpectedTitle) {
		
		  Assert.assertTrue(title.contains(ExpectedTitle));
	}

	@Then("forget password link should be displayed")
	public void forget_password_link_should_be_displayed() {
	 Assert.assertTrue( loginPage.isForgotpasswrdlinkavail()); 
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
	 loginPage.enterUsername(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
	   loginPage.enterPassword(password);
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
	   loginPage.clickonLogin();
	}

	@Then("user gets the title of the account page")
	public void user_gets_the_title_of_the_account_page() {
	   acTitle = loginPage.accountTitle();
	   System.out.println("please verify you login here "+acTitle );
	 
	}
	@Then("Account page title should be {string}")
	public void Accountpage_title_should_be(String ExpAcPagetitle) {
		
	  Assert.assertTrue(acTitle.contains(ExpAcPagetitle));
	}
}
