package com.example.testautomation.steps;

import com.example.testautomation.support.Driver;
import com.example.testautomation.support.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;

public class AssertSteps {

    private Driver driver = Driver.getInstance();
    private Page page = Page.getInstance();

    @Then("^I should see text \"([^\"]*)\"$")
    public void shouldSeeText(String text) {
      String locator = String.format("//*[contains(@text, '%s') or contains(@content-desc, '%s')]", text, text);
      driver.getDriver().findElement(By.xpath(locator)).isDisplayed();
    }

    @Then("^I should see element \"([^\"]*)\" enabled$")
    public void shouldSeeElementEnabled(String key) {
      WebElement element = page.getElement(key);
      element.isEnabled();
    }
}
