package org.bdd.sample.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;
import org.bdd.sample.pojo.Color;

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

  @Given("I have a {color} ball")
  public void iHaveAColorBall(Color color) {
    System.out.println(color);
  }

  //https://cucumber.io/docs/cucumber/configuration/?lang=java
  @ParameterType("red|blue|yellow")
  public Color color(String color){
    return new Color(color);
  }

  @Given("I have a below details")
  public void iHaveABelowDetails(DataTable dataTable) {
    List<List<String>> lists = dataTable.asLists();
    System.out.println("printing list");
    lists.forEach(list -> list.forEach(System.out::println));
  }

}
