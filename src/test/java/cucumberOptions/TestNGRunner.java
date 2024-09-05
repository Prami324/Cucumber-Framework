package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/featurefile", glue="stepDefinitions", monochrome = true, 
tags ="not @RegressionTest"//@SmokeTest or @RegressionTest  dryRun = true,
,plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"})
public class TestNGRunner extends AbstractTestNGCucumberTests{	
	

}
