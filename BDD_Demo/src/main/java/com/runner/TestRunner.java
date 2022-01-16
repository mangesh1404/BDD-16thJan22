package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src/main/java/com/features",
		glue="com.stepdefs",
		format= {"html:target"},
		dryRun=true,// to compile feature file
		monochrome=true// used for readable output
		// tags are used to run a specific scenario/feature
		)

public class TestRunner {

	/*
	 * 1 Scenarios ([32m1 passed[0m)
       3 Steps ([32m3 passed[0m)
	 * 
	 * 
	 * 1 Scenarios (1 passed)
	   3 Steps (3 passed)
	 */
	
}
