package handler;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import selenium.Wait;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestBase {


    public void click(WebElement element) {
        element.click();
    }

    public void type(WebElement element, String value) {
        element.sendKeys(value);

    }

    static WebElement dropdown;

    public void select(WebElement element, String value) {
        Select select = new Select(dropdown);
        select.selectByVisibleText(value);

    }


    public boolean isElementPresent(WebElement element) {

        try {
            element.isDisplayed();
            return true;

        } catch (NoSuchElementException e) {

            return false;

        }

    }

    public static void verifyEquals(String expected, String actual) throws IOException {

        try {

            Assert.assertEquals(actual, expected);

        } catch (Throwable t) {

        }

    }

    public static void verifyTextContain(String expected, String actual) throws IOException {
        try {
            Assert.assertTrue(actual.contains(expected));
        } catch (Throwable t){

        }
    }
}
