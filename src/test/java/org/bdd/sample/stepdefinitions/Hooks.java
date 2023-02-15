package org.bdd.sample.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

  @Before("@SanityTest")
  public void before() {
    System.out.println("Running before sanity test");
  }

  @After("@SanityTest")
  public void after() {
    System.out.println("Running after sanity test");
  }

}
