package stepDefinitions;

import cucumber.TextContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.SignUp;
import testDataTypes.VehicleInfo;

import java.io.IOException;

public class SignUpSteps {
	TextContext textContext;
	SignUp signup;

	public SignUpSteps(TextContext context) {
		textContext = context;
		signup = textContext.getPageObjectManager().getSignUpPage();
	}

	@When("User enters all required information")
	public void userEntersAllRequiredInformation() {
		signup.enterInformation();
	}

	@And("User clicks SignIn button on the Sign Up page")
	public void userClicksButtonOnTheSignUpPage() {
		signup.clickSignIn();
	}



	//Assertion
	@Then("The system navigates to Signup page")
	public void theSystemNavigatesToSignupPage() throws IOException {
		signup.assertSignUpPage();
	}

}
