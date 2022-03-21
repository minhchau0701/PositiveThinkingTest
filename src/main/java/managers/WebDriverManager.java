package managers;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import enums.DriverType;
import enums.EnvironmentType;
import io.cucumber.java.Scenario;
import testDataTypes.WebDriverType;

public class WebDriverManager {
    private static WebDriverType browserInfo;
    private static DriverType driverType;
    private static EnvironmentType environmentType;
    private static String driverPath = FileReaderManager.getInstance().getConfigReader().getDriverPath();
    private static String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
    private static String FIREFOX_DRIVER_PROPERTY = "webdriver.gecko.driver";
    private static String MSEDGE_DRIVER_PROPERTY = "webdriver.edge.driver";
    private static String IE_DRIVER_PROPERTY = "webdriver.ie.driver";
    private WebDriver driver;
    private Scenario _scenario;


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
                Path firefoxDriverPath = Paths.get(driverPath, "geckodriver.exe");
                System.setProperty(FIREFOX_DRIVER_PROPERTY, firefoxDriverPath.toString());
                System.out.println("------------" + firefoxDriverPath);
                driver = new FirefoxDriver();
                break;
            case CHROME:
                Path chromeDriverPath = Paths.get(driverPath, "chromedriver.exe");
                System.setProperty(CHROME_DRIVER_PROPERTY, chromeDriverPath.toString());
                driver = new ChromeDriver();
                break;
            case MICROSOFTEDGE:
                Path edgeDriverPath = Paths.get(driverPath, "msedgedriver.exe");
                System.setProperty(MSEDGE_DRIVER_PROPERTY, edgeDriverPath.toString());
                driver = new EdgeDriver();
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
