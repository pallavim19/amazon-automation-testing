package com.amazon.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BasePage {
    public WebDriver driver;

    //Constructor
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Navigate the web page based upon url
     * @param url
     */
    public void navigate(String url) {
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }

    /**
     * Click element
     * @param elementLocation
     */
    public void click(By elementLocation) {
        driver.findElement(elementLocation).click();
    }

    /**
     * Type text on the text box
     * @param elementLocation
     * @param text
     */
    public void writeText(By elementLocation, String text) {
        driver.findElement(elementLocation).sendKeys(text);
    }

    /**
     * Read the element
     * @param elementLocation
     * @return
     */
    public String readText(By elementLocation) {
        return driver.findElement(elementLocation).getText();
    }

    /**
     * Sort from the dropdown list and select value
     * @param value
     */
    public void sortBy(String value){
        new Select(driver.findElement(By.id("sort"))).selectByValue(value);
    }


    /**
     * Check if the element is present
     * @param by
     * @return Boolean value
     */
    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    /**
     * Get all elements from the node
     * @param by
     * @return List of WebElement
     */
    public List<WebElement> getList(By by) {
            return driver.findElements(by);
    }

    /**
     * Get  element from the node
     * @param by
     * @return WebElement
     */
    public WebElement getElement(By by) {
        return driver.findElement(by);
    }
}