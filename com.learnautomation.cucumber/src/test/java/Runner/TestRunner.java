package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature",glue={"stepDefinition"}, plugin={"html:target/cucumber-html-report"})
public class TestRunner {

}
