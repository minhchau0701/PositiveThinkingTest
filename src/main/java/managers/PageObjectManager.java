package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.EnvConfig;
import pageObjects.HomePage;
import pageObjects.SignIn;
import pageObjects.SignUp;

public class PageObjectManager {
	private final WebDriver driver;
	private EnvConfig env;
	private SignUp signup;
	private HomePage homepage;
	private SignIn signin;
	
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
	public SignIn getSignInPage() {
		return (signin == null) ? signin = new SignIn(driver) : signin;
	}
}
