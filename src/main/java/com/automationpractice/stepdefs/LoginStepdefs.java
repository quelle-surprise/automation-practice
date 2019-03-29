package com.automationpractice.stepdefs;

import com.automationpractice.pageobjects.LoginPage;
import com.automationpractice.utils.Navigation;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by piotroj on 2019-03-29
 */
public class LoginStepdefs {

   @Autowired
   Navigation navigation;
   @Autowired
   LoginPage loginPage;

   @Given("^I am on login page$")
   public void iAmOnLoginPage() {
      navigation.goToSignInPage();
   }

   @Then("^Create an account form is visible$")
   public void createAnAccountFormIsVisible() {

   }

   @And("^Sign in form is visible$")
   public void signInFormIsVisible() {
      loginPage.signInFormAppearsAsExpected();
   }
}
