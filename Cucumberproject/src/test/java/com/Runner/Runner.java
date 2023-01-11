package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 

@CucumberOptions(features="src/test/resources/Features",glue={"com.stepDefinition"},
//monochrome=true,

//publish=true,
//plugin= {"html:Reports\\HTMLReports","json:Reports\\JsonReports\\cucumber.json",
	//	"junit:Reports\\JunitReport\\cucumber.xml"},
dryRun=false

)
public class Runner {

}
