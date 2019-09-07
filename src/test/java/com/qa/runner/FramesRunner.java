package com.qa.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun=false,
		//strict=true,
		//tags={"@Test"},
		features={"./src/test/resources/com/qa/features/frames.feature"},
		glue={"com.qa.stepdef"},//./src/main/java/com/qa/stepdefinations   com.qa.stepdefinations
		plugin={"pretty","html:test-output/cucumber.html"},
		monochrome=true
		
		
		)
public class FramesRunner {}	
