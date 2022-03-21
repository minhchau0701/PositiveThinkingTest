package pageObjects;


import handler.TestBase;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;
import java.util.Map;


public class SignIn extends TestBase {

    public WebDriver webDriver;
    // -----------Declare elements-----------
    @FindBy(how = How.XPATH, using = "//input[@placeholder='Email']")
    private WebElement txt_Email;
    @FindBy(how = How.XPATH, using = "//input[@placeholder='Password']")
    private WebElement txt_Password;
    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    private WebElement btn_SignIn;
    @FindBy(how = How.XPATH, using = "//ul[@class='error-messages']/li")
    private WebElement lbl_ErrorMessage;
    public SignIn(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.webDriver = driver;
    }
    // ------------Actions--------------------

    public void enterInformation (DataTable userTable) throws IOException {
        List<Map<String, String>> user = userTable.asMaps(String.class, String.class);
        for (Map<String, String> form : user) {
            String userName = form.get("Email");
            String passWord = form.get("Password");
            String errorMessage = form.get("ErrorMessage");
            System.out.println("Username :" + userName);
            type(txt_Email,userName);
            type(txt_Password,passWord);
            click(btn_SignIn);

            String actualErrorMessage = lbl_ErrorMessage.getText();
            verifyEquals(errorMessage,actualErrorMessage);

        }

    }

    //Assertions

    

}
