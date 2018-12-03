package com.amazon.test.driver.browser;

import com.amazon.test.driver.DriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager {
    @Override
    protected void startService() {
        createDriver();
    }

    @Override
    protected void stopService() {
        driver.close();
    }

    @Override
    protected void createDriver() {
        //Driver Instantiation: Instantiate driver object
        driver = new ChromeDriver();
    }
}
