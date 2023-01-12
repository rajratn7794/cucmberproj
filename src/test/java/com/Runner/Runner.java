package com.Runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features= {"src/test/resources/Features"},
			glue= {"com.stepDefinition"},
			//plugin= {"pretty","html:Reports/cucumber.html"},
			monochrome=true,
			dryRun=false
)
public class Runner {

}
         