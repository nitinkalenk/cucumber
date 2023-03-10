package org.bdd.sample.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\org\\bdd\\sample\\features", glue = "org.bdd.sample.stepdefinitions",
    stepNotifications = true, plugin = {"pretty", "html:target/report.html", "json:target/report.json", "junit:target/junit.xml"})
public class TestRunner {

}
