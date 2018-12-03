package com.amazon.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.amazon.test.util.Constants.*;
import static java.util.concurrent.TimeUnit.SECONDS;

public class ProductDisplayPage extends BasePage {

    public ProductDisplayPage(WebDriver driver) {
        super(driver);
    }

    public void sortByPrice() {
        sortBy(SORT_BY_PRICE);
    }

    public void clickCheapestItemLink() {
        waitForElement();
        driver.findElement(By.xpath(RESULT)).findElement(By.xpath(CHEAPEST_LINK)).click();
    }

    private void waitForElement(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(RESULT)));
    }

    public void clickCheckout() {
        click(By.xpath(CART));
    }
}


