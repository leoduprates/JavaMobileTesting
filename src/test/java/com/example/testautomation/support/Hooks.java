package com.example.testautomation.support;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    private Driver driver = Driver.getInstance();
    private Page page = Page.getInstance();

    @Before
    public void setup(Scenario scenario) {
        page.setTags(scenario.getSourceTagNames());
        page.getPageObjects();
        driver.setDriver();
    }

    @After
    public void teardown() {
        driver.getDriver().quit();
    }
}
