package pageObjects;

import handler.TestBase;
import managers.FileReaderManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import selenium.Wait;

import java.io.IOException;

public class HomePage extends TestBase {
    private WebDriver webDriver;
    // -----------Declare elements-----------
    @FindBy(how = How.XPATH, using = "//a[@href='#register']")
    private WebElement lbtn_SignUp;
    @FindBy(how = How.XPATH, using = "//a[@href='#login']")
    private WebElement lbtn_SignIn;
    @FindBy(how = How.XPATH, using = "//img[contains(@src,'smiley-cyrus')]//parent::a")
    private WebElement hlk_Account;
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Your Feed')]")
    private WebElement tab_YourFeed;
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Global Feed')]")
    private WebElement tab_GlobalFeed;


    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.webDriver = driver;
    }


    // Actions
    public void navigatetoSelectedPage (String nameBtn) {
        switch (nameBtn) {
            case "SIGNUP":
                navigateSignUpPage();
                break;
            case "SIGNIN":
                navigateSignInPage();
                break;
            default:
                break;
        }
    }
    public void navigateSignUpPage (){
        click(lbtn_SignUp);
    }

    public void navigateSignInPage (){
        click(lbtn_SignIn);
    }

    //Assertions
    SignUp signup = new SignUp(webDriver);
    public void assertLoggedInHome () throws IOException {
        Wait.untilPageLoadComplete(webDriver, FileReaderManager.getInstance().getConfigReader().getLoadingWait());
        isElementPresent(hlk_Account);
        verifyEquals(signup.userName,hlk_Account.getText());
        isElementPresent(tab_GlobalFeed);
        isElementPresent(tab_YourFeed);
    }
}
