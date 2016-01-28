package com.example;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


/**
 * Created by myuzkollar on 11/01/16.
 */
@SpringApplicationConfiguration
public abstract class Base {

    RemoteWebDriver webDriver;

    @BeforeClass
    public void initDriver() {
        String browserName = System.getProperty("browser");
        System.out.println("You are testing on browser " + browserName);
        browserName = browserName.toLowerCase();
        if (browserName == null) {
            browserName = "firefox";
        }
        webDriver = LocalDriverFactory.createInstance(browserName);
    }


    @AfterClass
    public void tearDown() {
        webDriver.close();
    }
}
