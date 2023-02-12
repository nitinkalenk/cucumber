package org.bdd.sample.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\java\\org\\bdd\\sample\\features", glue = "org.bdd.sample.stepdefinitions")
public class TestNgTestRunner extends AbstractTestNGCucumberTests {

}
