package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( 
		// -----------------------
		monochrome = true
		//,strict = false
		,plugin = {"pretty", "json:target/cucumber-reports/json-report.json"}
        ,features = {"src/test/resources/functionalTests"}
		,glue={"stepDefinitions"}
		//,dryRun = true
		)
public class TestRunner  {

}
