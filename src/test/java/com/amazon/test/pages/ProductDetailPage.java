package com.amazon.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.amazon.test.util.Constants.OFFER_TEXT;

public class ProductDetailPage extends BasePage {

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isProductOfferPresent() {
        return isElementPresent(By.xpath(OFFER_TEXT));
    }

    public void clickProduct() {
        click(By.xpath(OFFER_TEXT));
    }
}
