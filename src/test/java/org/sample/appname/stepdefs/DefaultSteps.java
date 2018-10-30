package org.sample.appname.stepdefs;

import cucumber.api.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.sample.appname.helpers.DateHelpers;
import org.sample.appname.helpers.DriverManagerHelper;

import java.io.File;
import java.io.IOException;

public class DefaultSteps  extends DriverManagerHelper {

    @Then("^I touch the text \"([^\"]*)\"$")
    public void touchText(String text)  {
        getDriver().findElement(By.xpath("//*[contains(@text, '" + text + "')]")).click();
    }

    @Then("^I enter \"([^\"]*)\" into field with id \"([^\"]*)\"$")
    public void setText(String text, String id)   {
        getDriver().findElement(By.id(id)).sendKeys(text);
    }

    @Then("^I wait to see the text \"([^\"]*)\"$")
    public void waitTextIsDisplayed(String text)   {
        getDriver().findElement(By.xpath("//*[contains(@text, '" + text + "')]")).isDisplayed();
    }

    @Then("^I take screenshot$")
    public void getScreenshot() throws IOException {
        File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("./src/test/resources/screenshots/" + "app_" + DateHelpers.getDate("ddmmyyyy_hhmmss") + ".png"));
    }
}
