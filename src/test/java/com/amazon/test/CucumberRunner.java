package com.amazon.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:reports/test-report"},
        features = {"classpath:feature/"},
        tags = "@AmazonUITest")
public class CucumberRunner {
}

