package com.amazon.test.def;

import com.amazon.test.driver.DriverManager;
import com.amazon.test.driver.DriverManagerFactory;
import com.amazon.test.driver.DriverType;
import com.amazon.test.pages.*;
import com.amazon.test.util.Constants;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static java.lang.Double.valueOf;
import static java.util.concurrent.TimeUnit.SECONDS;

public class AmazonAutomationDefinition {

    private DriverManager driverManager;
    private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;
    private CheckoutPage checkoutPage;
    private ProductDetailPage productDetailPage;
    private ProductDisplayPage productDisplayPage;
    private ProductOfferPage productOfferPage;

    @Given("^I open webpage of Amazon.com$")
    public void openWebPage() {
        homePage.navigate();
    }

    @When("^I search for '(.*?)'$")
    public void provideName(String name) {
        homePage.provideName(name);
    }

    @When("^I click on search button$")
    public void clickSearchButton() {
        homePage.clickSearchButton();
    }

    @And("^I sort Prices from Low to High$")
    public void sortByLowToHighPrice() {
        productDisplayPage.sortByPrice();
    }

    @When("^I click checkout button$")
    public void clickOnCheckOutButton() {
        checkoutPage.clickCheckout();
    }

    @Then("^The confirmation text is valid and matches to expected message$")
    public void verifyLoginPage() {
        String confirmationMessage = loginPage.getConfirmationMessage();
        Assert.assertEquals(Constants.TEXT_CONFIRMATION_MESSAGE_IS_WRONG, confirmationMessage, "Sign in");
    }

    @And("^I add the cheapest product to my Cart$")
    public void addCheapestItemToCart() {
        productDisplayPage.clickCheapestItemLink();
        // Cheapest Price can be present in the offer
        if (productDetailPage.isProductOfferPresent()) {
            productDetailPage.clickProduct();
            getCheapestProductFromOffers();
        } else {
            productDisplayPage.clickCheckout();
        }
    }

    private void getCheapestProductFromOffers() {
        WebElement addToCartElement = null;
        int optionCounter = 1;
        Double cheapestPrice = 0.0;
        List<WebElement> products = productOfferPage.getAllProducts();
        for (WebElement product : products) {
            driver.manage().timeouts().implicitlyWait(2, SECONDS);
            Double amount = valueOf(productOfferPage.getAmountElement(product).getText().trim().replace("$", ""));
            if (optionCounter > 1) {
                if (amount < cheapestPrice) {
                    addToCartElement = productOfferPage.getCartElement(product);
                }
            } else {
                addToCartElement = productOfferPage.getCartElement(product);
                cheapestPrice = amount;
            }
            optionCounter++;
        }
        addToCartElement.click();
    }

    @Before
    public void startUp() {
        initDrivers();
        initPages();
    }

    private void initDrivers() {
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
    }

    private void initPages() {
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        checkoutPage = new CheckoutPage(driver);
        productDetailPage = new ProductDetailPage(driver);
        productDisplayPage = new ProductDisplayPage(driver);
        productOfferPage = new ProductOfferPage(driver);
    }

    @After
    public void close() {
        driverManager.getDriver().quit();
    }
}
