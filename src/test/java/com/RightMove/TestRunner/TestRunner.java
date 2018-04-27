package com.RightMove.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ={"src/test/java/resources/featureFiles"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
        glue ={"com.RightMove.StepDefs"},
        tags = {"@all"})
		//,dryRun = true,
        //monochrome = true)
public class TestRunner {

}
