package com.example.testautomation.steps;

import java.io.IOException;

import com.example.testautomation.support.Driver;

import org.openqa.selenium.ScreenOrientation;

import io.cucumber.java.en.Then;

public class RotateSteps {
  private Driver driver = Driver.getInstance();

  @Then("^I rotate to (landascape|portrait)$")
  public void rotate(String orientation) throws IOException {
    if (orientation == "landascape")
      driver.getDriver().rotate(ScreenOrientation.LANDSCAPE);

    if (orientation == "portrait")
      driver.getDriver().rotate(ScreenOrientation.PORTRAIT);
  }
}
