package org.sample.appname.helpers;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class CapabilitiesHelpers {

    private static DesiredCapabilities capabilities;

    public static DesiredCapabilities getCapabilities() {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        capabilities.setCapability(MobileCapabilityType.APP, new File("./src/test/resources/app/ApiDemos-debug.apk"));

        return capabilities;
    }
}
