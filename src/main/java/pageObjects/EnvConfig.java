package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class EnvConfig {
	WebDriver driver;


	
	public EnvConfig(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navigateSite (String url) {
		driver.get(url);
	}
	

}
