# amazon automation testing

Amazon Automation is web application for selecting cheapest price items and adding to the cart from the amazon.com web page.
The web testing is covered with Cucumber and Selenium tests.

The web page is "https://www.amazon.com"

# Instructions

Clone the repo:

Git:
```
$ git clone git@github.com:pallavim19/amazon-automation-testing.git
```

Or download a ZIP of master [manually](https://github.com/pallavim19/amazon-automation-testing.git) and expand the contents someplace on your system

## Prerequisites

In order to run browser tests, Selenium will need to be able to drive a browser
installed to your system.

## Verify installation

## Use Maven

Open a command window and run:

    mvn clean -Dwebdriver.chrome.driver="<path of chromedriver.exe>" test

This runs Cucumber features using Cucumber's JUnit runner. 
