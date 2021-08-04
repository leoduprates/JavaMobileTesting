<p>
    <img alt="Java" src="https://img.shields.io/badge/java-007396.svg?style=for-the-badge&logo=java&logoColor=white"/>
    <img alt="APPIUM" src="https://img.shields.io/badge/Appium-AA00FF.svg?style=for-the-badge&logo=Google%20Chrome&logoColor=white"/>
    <img alt="Cucumber" src="https://img.shields.io/badge/Cucumber-23D96C.svg?style=for-the-badge&logo=Cucumber&logoColor=white"/>
    <img alt="Gradle" src="https://img.shields.io/badge/Gradle-0f303b.svg?style=for-the-badge&logo=Gradle&logoColor=white"/>
    <a href="https://linkedin.com/in/leonardo-duprates">
        <img alt="LinkedIn" src="https://img.shields.io/badge/linkedin-%230077B5.svg?&style=for-the-badge&logo=linkedin&logoColor=white"/>
    </a>
</p>

# Java Mobile Testing

Behavior driven development (BDD) approach to write automation test scripts to test mobile applications using Java, Appium and Cucumber.

## Project Architecture

The project architecture uses the standard Cucumbers structure.

```shell
JavaMobileTesting
├── src
│   ├── test
│       ├── java/com/example/testautomation
│           ├── features
│           ├── pages
│           ├── steps
│           ├── support
│           ├── utils
│       ├── resources
│           ├── app
│           ├── configs
│           ├── reports
│           ├── screenshots
```

## Built With

- [appium](https://mvnrepository.com/artifact/io.appium/java-client/7.5.1)
- [commons-io](https://mvnrepository.com/artifact/commons-io/commons-io/2.11.0)
- [cucumber-jvm](https://mvnrepository.com/artifact/io.cucumber/cucumber-jvm/6.10.4)
- [cucumber-junit](https://mvnrepository.com/artifact/io.cucumber/cucumber-junit/6.10.4)
- [gson](https://mvnrepository.com/artifact/com.google.code.gson/gson)

## Design Patterns

This project uses the design patterns from [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html).

## Getting Started

### Project

1. Install Java using [Official Documentation](https://java.com/en/download/help/download_options.html).

2. Install Gradle using [Official Documentation](https://gradle.org/install/)

3. Review and setup the configuration in src/test/resources/configs:

   ```properties
    appium.server=http://0.0.0.0:4723/wd/hub
    appium.timeout=30
    appium.platformVersion=11
    appium.deviceName=Pixel_3_API_30
    appium.app=/src/test/resources/app/test-automation-tool.apk
   ```

4. Build Project

   ```shell
   $ gradle build
   ```

5. Run Tests

   ```shell
   $  gradle test -Dcucumber.options="-tags @tagname"
   ```

### Appium

1. Install Appium Server using [Official Documentation](https://appium.io/docs/en/about-appium/getting-started/?lang=en).

2. Run Appium Server (NPM Global):

    ```
    appium
    ```

### Android

1. Install Android SDK using [Official Documentation](https://developer.android.com/studio/install).

2. After created an emulator, can use the follow command to start:

    ```shell
    $ emulator @emulator_name
    ```

3. List Devices

    ```shell
    $ emulator -list-avds
    ```

4. Mapping the elements

    ```shell
    $ uiautomatorviewer
    ```

## Links

- [Appium](https://appium.io/)
- [Cucumber JVM](https://cucumber.io/docs/installation/java/)
- [Java](https://java.com/)
- [Gadle](https://gradle.org/)
- [Maven](https://mvnrepository.com/)
- [Selenium](https://www.selenium.dev/)
