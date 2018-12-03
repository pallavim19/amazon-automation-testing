package com.amazon.test.pages;

import com.amazon.test.util.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.amazon.test.util.Constants.CART_ELEMENT;
import static com.amazon.test.util.Constants.PRICE_ELEMENT;
import static com.amazon.test.util.Constants.PRODUCT_LIST;

public class ProductOfferPage extends BasePage {

    public ProductOfferPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getCartElement(WebElement element) {
        return element.findElement(By.name(CART_ELEMENT));
    }

    public WebElement getAmountElement(WebElement element) {
       return  element.findElement(By.xpath(PRICE_ELEMENT));
    }

    public List<WebElement> getAllProducts() {
        return getList(By.xpath(PRODUCT_LIST));
    }
}