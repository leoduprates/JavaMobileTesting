package com.example.testautomation.support;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.example.testautomation.utils.PropertiesUtils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Driver {

    private AppiumDriver<MobileElement> driver;
    private Capabilities caps = new Capabilities();
    private Logger logger = Logger.getLogger(Driver.class.getName());
    private PropertiesUtils props = new PropertiesUtils();

    private static Driver INSTANCE;

    private Driver() {
    }

    public static Driver getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Driver();
        }

        return INSTANCE;
    }

    public void setDriver() {
        try {
            String url = props.get("appium.server");

            this.driver = new AndroidDriver<MobileElement>(new URL(url), caps.getCapabilities());
            this.driver.manage().timeouts().implicitlyWait(Integer.parseInt(props.get("appium.timeout")),
                    TimeUnit.SECONDS);
        } catch (Exception exception) {
            logger.log(Level.SEVERE, exception.getMessage());
        }
    }

    public AppiumDriver<MobileElement> getDriver() {
        return this.driver;
    }
}
