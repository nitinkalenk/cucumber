package org.bdd.sample.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

  @Given("User is on NetBanking Landing Page")
  public void userIsOnNetBankingLandingPage() {
    System.out.println("User is on NetBanking Landing Page");
  }

  //https://github.com/cucumber/cucumber-expressions
  @When("User Logs in to application with username {string} and password {string}")
  public void userLogsInToApplicationWithUsernameAndPassword(String username, String password) {
    System.out.println(String.format("User Logs in to application with username %s and password %s", username, password));
  }

  @Then("Home Page is displayed")
  public void homePageIsDisplayed() {
    System.out.println("Home Page is displayed");
  }

  @And("Cards are displayed")
  public void cardsAreDisplayed() {
    System.out.println("Cards are displayed");
  }

}
