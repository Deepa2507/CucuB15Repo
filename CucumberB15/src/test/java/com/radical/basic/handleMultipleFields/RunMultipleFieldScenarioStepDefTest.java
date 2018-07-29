package com.radical.basic.handleMultipleFields;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/com/radical/basic/handleMultipleFields/" },
					glue={"com/radical/basic/handleMultipleFields/"},
					monochrome = true, //console output in readable format
					//dryRun = true,
					plugin = {"pretty", 
							"html:target/cucumber-htmlreport", 
							"json:target/cucumber-report"+1234+".json",
							"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
					}
					)

public class RunMultipleFieldScenarioStepDefTest {

}
