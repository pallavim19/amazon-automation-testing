package com.amazon.test.util;

public class Constants {

    public static final String WEB_URL = "https://www.amazon.com";
    public static final String TEXT_CONFIRMATION_MESSAGE_IS_WRONG = "Text confirmation message is wrong!";
    public static final String CHECKOUT_TEXT = "//a[contains(text(),'Proceed to checkout')]";
    public static final String SEARCH_TEXT_BOX = "twotabsearchtextbox";
    public static final String SEARCH_BUTTON = "nav-input";
    public static final String CONFIRMATION_TEXT = "a-spacing-small";
    public static final String OFFER_TEXT = "//a[@title='See All Buying Options']";
    public static final String SORT_BY_PRICE = "price-asc-rank";
    public static final String RESULT = "//li[contains(@class,'result')]";
    public static final String CHEAPEST_LINK = "div//h2[@class='a-size-base s-inline  s-access-title  a-text-normal']";
    public static final String CART = "//input[@value='Add to Cart' or @value='Add to cart']";
    public static final String CART_ELEMENT = "submit.addToCart";
    public static final String PRICE_ELEMENT = "div[@class='a-column a-span2 olpPriceColumn']/span";
    public static final String PRODUCT_LIST = "//div[@id='olpOfferList']//div[@class='a-row a-spacing-mini olpOffer']";
}
