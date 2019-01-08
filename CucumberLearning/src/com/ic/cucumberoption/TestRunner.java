package com.ic.cucumberoption;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/com/ic/featurefiles", 
				tags={"@News"},
				monochrome = true,
				glue = "com/ic/stepdefinitions",
				plugin = {"pretty","html:src/target/cucumberReport"})
public class TestRunner {

}