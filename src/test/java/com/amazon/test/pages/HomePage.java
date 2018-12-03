package com.amazon.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.amazon.test.util.Constants.*;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void navigate() {
        navigate(WEB_URL);
    }

    public void provideName(String name) {
        writeText(By.id(SEARCH_TEXT_BOX),name);
    }

    public void clickSearchButton() {
        click(By.className(SEARCH_BUTTON));
    }

}

