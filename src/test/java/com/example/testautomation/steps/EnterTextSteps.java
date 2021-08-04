package com.example.testautomation.steps;

import com.example.testautomation.support.Page;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class EnterTextSteps {

  private Page page = Page.getInstance();

  @When("^I enter \"([^\"]*)\" into \"([^\"]*)\"$")
  public void enterText(String text, String key) {
    WebElement element = page.getElement(key);
    element.sendKeys(text);
  }
}
