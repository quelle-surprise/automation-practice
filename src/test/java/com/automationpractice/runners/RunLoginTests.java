package com.automationpractice.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by piotroj on 2019-03-29
 */
@RunWith(Cucumber.class)
@CucumberOptions(
      features = {"src/test/resources/features/Login.feature"},
      format = {"html:target/cucumber"}
)
public final class RunLoginTests extends TestRunner {
}
