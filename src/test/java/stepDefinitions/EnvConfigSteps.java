package stepDefinitions;


import cucumber.TextContext;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.FileReaderManager;
import pageObjects.EnvConfig;


public class EnvConfigSteps {
	TextContext textContext;
	EnvConfig env;
	Scenario scenario;
	
	public EnvConfigSteps(TextContext context) {
		textContext = context;
		env = textContext.getPageObjectManager().getEnvConfig();
	}
	
	@Given("^Launching website \"([^\"]*)\" on the browser$")
	public void launching_website_on_the_browser(String site) {
		String url =FileReaderManager.getInstance().getSiteConfigFileReader().getKey(site);
		env.navigateSite(url);
	}



}
