package com.example.testautomation.support;

import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import com.example.testautomation.utils.PropertiesUtils;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Capabilities {

    private PropertiesUtils props = new PropertiesUtils();

    public DesiredCapabilities getCapabilities() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, props.get("appium.platformVersion"));
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, props.get("appium.deviceName"));
        caps.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + props.get("appium.app"));

        return caps;
    }
}
