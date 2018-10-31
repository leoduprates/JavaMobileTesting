package org.sample.appname.support;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.sample.appname.helpers.CapabilitiesHelpers;
import org.sample.appname.helpers.DriverHelper;

public class Hooks extends DriverHelper {

    private static AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();

    @Before
    public void setup() {
        if (service.isRunning()) service.stop();
        service.start();
        setDriver("http://0.0.0.0:4723/wd/hub", CapabilitiesHelpers.getCapabilities());
    }

    @After
    public void teardown() {
        getDriver().quit();
        service.stop();
    }
}
