package org.sample.appname.helpers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class DriverManagerHelper {

    private static AppiumDriver<MobileElement> driver;

    public void setDriver(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public AppiumDriver<MobileElement> getDriver() {
        return this.driver;
    }
}
