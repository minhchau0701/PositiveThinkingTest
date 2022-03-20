package pageObjects;


import handler.RandomInformation;
import handler.TestBase;
import managers.FileReaderManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import selenium.Wait;

import java.io.IOException;


public class SignUp extends TestBase {
    public static final int NOCHARACTERS = 8 ;
    public static final String REGISTER = "register";
    public WebDriver webDriver;
    // -----------Declare elements-----------
    @FindBy(how = How.XPATH, using = "//input[@placeholder='Username']")
    private WebElement txt_UserName;
    @FindBy(how = How.XPATH, using = "//input[@placeholder='Email']")
    private WebElement txt_Email;
    @FindBy(how = How.XPATH, using = "//input[@placeholder='Password']")
    private WebElement txt_Password;
    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    private WebElement btn_SignIn;

    public SignUp(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.webDriver = driver;
    }
    // ------------Actions--------------------

    RandomInformation randomtext = new RandomInformation();
    public String userName = randomtext.getAlphabet(NOCHARACTERS);
    String passWord = randomtext.getAlphabet(NOCHARACTERS);

    public void enterInformation () {
        enterUserName();
        enterEmail();
        enterPassword();
    }
    public void enterUserName (){
        type(txt_UserName, userName);
    }
    public void enterEmail (){
        String Email = userName + "@gmail.com";
        type(txt_Email, Email);
    }
    public void enterPassword (){
        type(txt_Password, passWord);
    }

    public void clickSignIn (){
        click(btn_SignIn);
    }

    //Assertions
    boolean elementAvailable = true;
    public void assertSignUpPage () throws IOException {
        Wait.untilPageLoadComplete(webDriver, FileReaderManager.getInstance().getConfigReader().getLoadingWait());
        String currentUrl = webDriver.getCurrentUrl();
        verifyTextContain(REGISTER,currentUrl);

        if (isElementPresent(txt_Email) == false){
            elementAvailable = false;
        };
        if (isElementPresent(txt_UserName) == false){
            elementAvailable = false;
        };
        if (isElementPresent(txt_Password) == false){
            elementAvailable = false;
        };
        if (isElementPresent(btn_SignIn) == false){
            elementAvailable = false;
        };

        Assert.assertTrue(elementAvailable);
    }

}
