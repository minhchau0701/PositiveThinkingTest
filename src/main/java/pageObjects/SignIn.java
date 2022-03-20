package pageObjects;


import handler.RandomInformation;
import handler.TestBase;
import io.cucumber.datatable.DataTable;
import managers.FileReaderManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import selenium.Wait;

import java.io.IOException;
import java.util.List;


public class SignIn extends TestBase {

    public WebDriver webDriver;
    // -----------Declare elements-----------
    @FindBy(how = How.XPATH, using = "//input[@placeholder='Email']")
    private WebElement txt_Email;
    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    private WebElement btn_SignIn;

    public SignIn(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.webDriver = driver;
    }
    // ------------Actions--------------------

    public void enterInformation (DataTable usercredentials) {
        //List<List<String>> data = usercredentials.raw;

    }

    //Assertions

    

}
