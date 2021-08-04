package com.example.testautomation.support;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:src/test/resources/reports/cucumber.html" },
                publish = false,
                features = "./src/test/java/com/example/testautomation/features",
                glue = "com.example.testautomation")

public class Runner {
}
