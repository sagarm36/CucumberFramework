package StepDefinations;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="",features = {"src/test/resources/Features"}, glue = {"StepDefinations"},
plugin= {"pretty","html:target/htmlReport.html"}, monochrome = true)
public class TestRunnerClass extends AbstractTestNGCucumberTests{

}
