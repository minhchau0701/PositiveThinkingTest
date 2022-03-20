package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.EnvConfig;
import pageObjects.HomePage;
import pageObjects.SignUp;

public class PageObjectManager {
	private WebDriver driver;
	private EnvConfig env;
	private SignUp signup;
	private HomePage homepage;
	
	public PageObjectManager (WebDriver driver) {
		this.driver = driver;
	}
	
	public EnvConfig getEnvConfig() {
		return (env == null) ? env = new EnvConfig(driver) : env;
	}

	public HomePage getHomepagePage() {
		return (homepage == null) ? homepage = new HomePage(driver) : homepage;
	}

	public SignUp getSignUpPage() {
		return (signup == null) ? signup = new SignUp(driver) : signup;
	}
}
