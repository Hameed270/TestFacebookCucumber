package stepDefinations;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pages.LoginPage;
import com.pages.homepage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class HomePage {
	
	private LoginPage loginPage =new LoginPage(DriverFactory.getDriver());
	private homepage homePage;
	
	@Given("User has already logged in Application")
	public void user_has_already_logged_in_application(DataTable credTable) {
		
		List<Map<String, String>> credlist= credTable.asMaps();
		String userName = credlist.get(0).get("username");
		String PassWord = credlist.get(0).get("password");
		
		
		DriverFactory.getDriver()
		 	.get("http://automationpractice.pl/index.php?controller=authentication&back=my-account");
		
		   homePage = loginPage.doLoginMethod(userName, PassWord);
	    
	}

	@Given("user is on account page")
	public void user_is_on_account_page() {
	 String titleofPage = homePage.getAccountPagetitle();
	 System.out.println("This is the title "+ titleofPage);
	}

/*@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}*/

	
	@Then("user gets all account section")
	public void user_gets_all_account_section(DataTable sectionsTable) {
		
		List<String> expAccountsectList = sectionsTable.asList();
		System.out.println("Here we can verify expected list: "+ expAccountsectList);
		
		List<String> actuAccountsectList = homePage.getAccountlabelList();
		System.out.println("Here we can verify actual list: "+ actuAccountsectList);
		
		
		//Assert.assertTrue(expAccountsectList.containsAll(actuAccountsectList));
	}

	@Then("account section count should be {int}")
	public void account_section_count_should_be(Integer expectedcount) {
	    Assert.assertTrue(homePage.getAccountsectioncount()== expectedcount);
	}
	

	
}
