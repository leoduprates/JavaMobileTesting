package org.sample.appname.helpers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DriverHelper {

    private static AppiumDriver<MobileElement> driver;
    private Logger logger = Logger.getLogger(DriverHelper.class.getName());

    public void setDriver(String server, DesiredCapabilities capabilities) {
        try {
            driver = new AndroidDriver(new URL(server), capabilities);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        } catch (MalformedURLException exception) {
            logger.log(Level.SEVERE, exception.getMessage());
        }
    }

    public AppiumDriver<MobileElement> getDriver() {
        return this.driver;
    }
}
