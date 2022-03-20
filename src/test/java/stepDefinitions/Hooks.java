package stepDefinitions;


import cucumber.TextContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {
	TextContext textContext;
	Scenario scenario;
	
	public Hooks(TextContext context) {
		textContext = context;
	}

	@Before
	public void getScenarioName(Scenario scenario) {
		this.scenario = scenario;
		textContext.Init(scenario);
	}
	
	@After
	public void AfterSteps() {
		textContext.getWebDriverManager().closeDriver();
	}


}
