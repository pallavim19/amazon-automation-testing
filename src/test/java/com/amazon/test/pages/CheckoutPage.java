package com.amazon.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.amazon.test.util.Constants.CHECKOUT_TEXT;

public class CheckoutPage extends BasePage {

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void clickCheckout() {
        click(By.xpath(CHECKOUT_TEXT));
    }
}
