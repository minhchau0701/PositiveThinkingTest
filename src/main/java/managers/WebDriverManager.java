package managers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import enums.DriverType;
import enums.EnvironmentType;
import io.cucumber.java.Scenario;
import testDataTypes.WebDriverType;

public class WebDriverManager {
	private WebDriver driver;
	private Scenario _scenario;
	private static WebDriverType browserInfo;
	private static DriverType driverType;
	private static EnvironmentType environmentType;
	private static String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";


	public WebDriverManager(Scenario scenario) {
		driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
		environmentType = FileReaderManager.getInstance().getConfigReader().getEnvironment();
		_scenario = scenario;
	}

	public WebDriver getDriver() {
		if (driver == null) {
			driver = createDriver();				
		}
		return driver;
	}

	//Checking the running environment
	private WebDriver createDriver() {
		switch (environmentType) {
		case LOCAL:
			driver = createLocalDriver();
			break;
		case REMOTE:
			//driver = createRemoteBSDriver();
			break;
		}
		return driver;
	}


	// Local environment
	private WebDriver createLocalDriver() {
		switch (driverType) {
		case FIREFOX:
			driver = new FirefoxDriver();
			break;
		case CHROME:
			System.setProperty(CHROME_DRIVER_PROPERTY,
					FileReaderManager.getInstance().getConfigReader().getDriverPath());
			driver = new ChromeDriver();
			break;
		case INTERNETEXPLORER:
			driver = new InternetExplorerDriver();
			break;
		}
		if (FileReaderManager.getInstance().getConfigReader().getBrowserWindowSize())
			driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(),
				TimeUnit.SECONDS);
		return driver;
	}


	public void closeDriver() {
		driver.close();
		driver.quit();
	}

}
