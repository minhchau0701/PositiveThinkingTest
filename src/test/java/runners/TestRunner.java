package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( 
		// -----------------------
		monochrome = true
		//,strict = false
		,plugin = {"pretty", "html:target/cucumber-reports/reports.html"}
        ,features = {"src/test/resources/functionalTests"}
		,glue={"stepDefinitions"}
		//,dryRun = true
		)
public class TestRunner  {

}
