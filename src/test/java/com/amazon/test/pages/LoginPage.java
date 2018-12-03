package com.amazon.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.amazon.test.util.Constants.CONFIRMATION_TEXT;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public String getConfirmationMessage() {
        return readText(By.className(CONFIRMATION_TEXT));
    }
}
