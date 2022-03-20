package selenium;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.JavascriptExecutor;

import managers.FileReaderManager;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Wait {
	//private static final Object WebDriver = null;

	public static void untilAjaxIsDone(WebDriver driver, WebElement element) {
		untilAjaxIsDone(driver, FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), element);
	}

	public static void untilAjaxIsDone(WebDriver driver, Long timeoutInSeconds,WebElement element) {
		until(driver, (d) -> {
			Boolean isDisplay = element.isDisplayed();
			if (!isDisplay)
				System.out.println("Loading");
			return isDisplay;
		}, timeoutInSeconds);
	}


	public static void untilPageLoadComplete(WebDriver driver) {
		untilPageLoadComplete(driver, FileReaderManager.getInstance().getConfigReader().getImplicitlyWait());
	}

	public static void untilPageLoadComplete(WebDriver driver, Long timeoutInSeconds) {
		until(driver, (d) -> {
			Boolean isPageLoaded = (Boolean) ((JavascriptExecutor) driver).executeScript("return document.readyState")
					.equals("complete");
			if (!isPageLoaded)
				System.out.println("Document is loading");
			return isPageLoaded;
		}, timeoutInSeconds);
	}

	public static void until(WebDriver driver, Function<WebDriver, Boolean> waitCondition) {
		until(driver, waitCondition, FileReaderManager.getInstance().getConfigReader().getImplicitlyWait());
	}

	public static void untilElementLoad(WebDriver driver, Function<WebDriver, WebElement> waitCondition) {
		untilElementLoad(driver, waitCondition, FileReaderManager.getInstance().getConfigReader().getImplicitlyWait());
	}
	@SuppressWarnings("deprecation")
	public static void until(WebDriver driver, Function<WebDriver, Boolean> waitCondition, Long timeoutInSeconds) {
		WebDriverWait webDriverWait = new WebDriverWait(driver, timeoutInSeconds);
		webDriverWait.withTimeout(timeoutInSeconds, SECONDS);
		try {
			webDriverWait.until(waitCondition);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void untilElementLoad(WebDriver driver, Function<WebDriver, WebElement> waitCondition, Long timeoutInSeconds) {
		WebDriverWait webDriverWait = new WebDriverWait(driver, timeoutInSeconds);
		webDriverWait.withTimeout(timeoutInSeconds, SECONDS);
		try {
			webDriverWait.until(waitCondition);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}



}
