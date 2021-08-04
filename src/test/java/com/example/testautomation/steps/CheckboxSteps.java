package com.example.testautomation.steps;

import org.openqa.selenium.WebElement;

import com.example.testautomation.support.Driver;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;

public class CheckboxSteps {

  private Driver driver = Driver.getInstance();

  @When("^I toggle checkbox \"([^\"]*)\"$")
  public void toggleCheckboxByText(String text) {
    String locator = String.format("//android.widget.CheckBox[contains(@text, '%s') or contains(@content-desc, '%s')]",
        text, text);
    WebElement element =  driver.getDriver().findElement(By.xpath(locator));
    element.click();
  }

  @When("^I toggle checkbox number (\\d+)$")
  public void toggleCheckboxByIndex(Integer index) {
    String locator = String.format("//android.widget.CheckBox[@index = '%s']", index);
    WebElement element =  driver.getDriver().findElement(By.xpath(locator));
    element.click();
  }
}
