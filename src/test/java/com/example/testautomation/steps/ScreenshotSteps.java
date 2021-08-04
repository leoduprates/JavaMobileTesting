package com.example.testautomation.steps;

import java.io.File;
import java.io.IOException;

import com.example.testautomation.support.Driver;
import com.example.testautomation.utils.DateUtils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.en.Then;

public class ScreenshotSteps {
  private Driver driver = Driver.getInstance();

  @Then("^I take a screenshot$")
  public void getScreenshot() throws IOException {
      String path = String.format("%s/src/test/resources/screenshots/screenshot_%s.png", System.getProperty("user.dir"), DateUtils.getDate("ddmmyyyy_hhmmss"));
      File source = ((TakesScreenshot) driver.getDriver()).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(source, new File(path));
  }
}
