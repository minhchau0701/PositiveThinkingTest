package cucumber;


import io.cucumber.java.Scenario;
import managers.PageObjectManager;
import managers.WebDriverManager;


public class TextContext {
	private WebDriverManager webDriverManager;
	private PageObjectManager pageObjectManager;
	public ScenarioContext scenarioContext;

	public TextContext() {
//		Init();
		scenarioContext = new ScenarioContext();
	}

	public void Init(Scenario scenario) {
		webDriverManager = new WebDriverManager(scenario);
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
	}
	

	
	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}

	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}
	public ScenarioContext getScenarioContext() {
		 return scenarioContext;
	}
}
