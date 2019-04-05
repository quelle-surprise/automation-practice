package com.automationpractice.runners;

import com.automationpractice.pageobjects.LoginPage;
import com.automationpractice.utils.Navigation;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by piotroj on 2019-03-29
 */

public class LoginStepdefs {


   private Navigation navigation;
   private LoginPage loginPage;

   public LoginStepdefs() {
      navigation = new Navigation();
      loginPage = new LoginPage();
   }

   @Given("^I am on Sign in page$")
   public void iAmOnSignInPage() {
      navigation.goToSignInPage();
   }

   @And("^Sign in form is visible$")
   public void signInFormIsVisible() {
      loginPage.signInFormAppearsAsExpected();
   }

   @When("^I login with valid credentials$")
   public void iLoginWithValidCredentials() {
      loginPage.signInIntoApplication("dsadsa@gmail.com", "Welcome1");
   }

   @Then("^I will be logged in to app$")
   public void iWillBeLoggedInToApp() {

   }

   @And("^I will be redirected to My Account tab$")
   public void iWillBeRedirectedToMyAccountTab() {

   }

   @When("^I Login with invalid credentials$")
   public void iLoginWithInvalidCredentials() {
      loginPage.signInIntoApplication("dsadsa@gmail.com", "Welcome1");
   }

   @Then("^Error tooltip will appear on login page and I will not be logged in$")
   public void errorTooltipWillAppearOnLoginPageAndIWillNotBeLoggedIn() {
      loginPage.loginAuthenticationFailedTooltipAppearsAsExpected();
   }

   @When("^I Login with invalid email$")
   public void iLoginWithInvalidEmail() {
      loginPage.signInIntoApplication("32121", "Welcome1");
   }

   @Then("^Invalid email address tooltip will appear$")
   public void invalidEmailAddressTooltipWillAppear() {
      loginPage.emailAuthenticationFailedTooltipAppearsAsExpected();
   }
}
