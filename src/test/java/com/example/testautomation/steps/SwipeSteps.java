package com.example.testautomation.steps;

import java.io.IOException;

import com.example.testautomation.support.Driver;

import org.openqa.selenium.Dimension;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Then;

public class SwipeSteps {
  private Driver driver = Driver.getInstance();
  private TouchAction action = new TouchAction(driver.getDriver());

  @Then("^I swipe to right$")
  public void swipeRight() throws IOException {
    Dimension size = driver.getDriver().manage().window().getSize();
    int startY = size.height / 2;
    int startX = (int) (size.width * 0.90);
    int endX = (int) (size.width * 0.05);
    
    action.press(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, startY)).release().perform();
  }

  @Then("^I swipe to left$")
  public void swipeLeft() throws IOException {
    Dimension size = driver.getDriver().manage().window().getSize();
    int startY = size.height / 2;
    int startX = (int) (size.width * 0.05);
    int endX = (int) (size.width * 0.90);
    
    action.press(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, startY)).release().perform();
  }

  @Then("^I swipe to up$")
  public void swipeUp() throws IOException {
    Dimension size = driver.getDriver().manage().window().getSize();
    int startY = (int) (size.height * 0.55);
    int startX = size.width / 2;
    int endY = (int) (size.height * 0.9);
    
    action.press(PointOption.point(startX, startY)).moveTo(PointOption.point(startX, endY)).release().perform();
  }

  @Then("^I swipe to down$")
  public void swipeDown() throws IOException {
    Dimension size = driver.getDriver().manage().window().getSize();
    int startY = (int) (size.height * 0.90);
    int endY = (int) (size.height * 0.30);
    int startX = (size.width / 2);

    action.press(PointOption.point(startX, startY)).moveTo(PointOption.point(startX, endY)).release().perform();
  }
}
