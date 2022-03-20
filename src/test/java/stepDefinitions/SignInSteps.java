package stepDefinitions;

import cucumber.TextContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SignIn;

import java.io.IOException;

public class SignInSteps {
    TextContext textContext;
    SignIn signin;

    public SignInSteps(TextContext context) {
        textContext = context;
        signin = textContext.getPageObjectManager().getSignInPage();
    }
    @When("User enters credentials to SignIn")
    public void userEntersCredentialsToSignIn(DataTable usercredentials) {

    }

    @And("User clicks SignIn button on the SignIn page")
    public void userClicksSignInButtonOnTheSignInPage() {

    }

    @Then("The system displays the invalid error message and can not access to home page")
    public void theSystemDisplaysTheInvalidErrorMessageAndCanNotAccessToHomePage() {
    }



}

