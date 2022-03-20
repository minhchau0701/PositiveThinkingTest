package stepDefinitions;

import cucumber.TextContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.FileReaderManager;
import pageObjects.HomePage;
import pageObjects.SignUp;
import testDataTypes.VehicleInfo;

import java.io.IOException;

public class HomePageSteps {
	TextContext textContext;
	HomePage homepage;
	
	public HomePageSteps(TextContext context) {
		textContext = context;
		homepage = textContext.getPageObjectManager().getHomepagePage();
	}

	@Given("User clicks {string} button on Header menu")
	public void userClicksButtonOnHeaderMenu(String nameBtn) {
		homepage.navigatetoSelectedPage(nameBtn);
	}



	//Assertion
	@Then("The system navigates to Homepage for logging in the system successfully")
	public void theSystemNavigatesToHomepageForLoggingInTheSystemSuccessfully() throws IOException {
		homepage.assertLoggedInHome();
	}

}
