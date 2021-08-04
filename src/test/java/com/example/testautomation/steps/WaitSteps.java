package com.example.testautomation.steps;

import io.cucumber.java.en.Then;

public class WaitSteps {
  @Then("^I wait for (\\d+)$")
  public void wait(int seconds) throws InterruptedException {
    Thread.sleep(seconds * 1000);
  }
}
