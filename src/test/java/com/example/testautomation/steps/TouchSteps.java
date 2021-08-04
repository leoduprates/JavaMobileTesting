package com.example.testautomation.steps;

import com.example.testautomation.support.Page;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class TouchSteps {

    private Page page = Page.getInstance();

    @When("^I touch the \"([^\"]*)\"$")
    public void touch(String key) {
        WebElement element = page.getElement(key);
        element.click();
    }
}
