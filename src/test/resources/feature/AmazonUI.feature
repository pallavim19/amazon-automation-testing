@AmazonUITest
Feature: To test web page of Amazon Page

  Scenario Outline: Enter the products in Text field and sort the product based upon prices and click checkout button

    Given I open webpage of Amazon.com
    When I search for '<product1>'
    When I click on search button
    And I sort Prices from Low to High
    And I add the cheapest product to my Cart
    When I search for '<product2>'
    When I click on search button
    And I sort Prices from Low to High
    And I add the cheapest product to my Cart
    When I search for '<product3>'
    When I click on search button
    And I sort Prices from Low to High
    And I add the cheapest product to my Cart
    When I click checkout button
    Then The confirmation text is valid and matches to expected message

    Examples:
      | product1 | product2 | product3 |
      | Snickers | Twix     | Skittles |