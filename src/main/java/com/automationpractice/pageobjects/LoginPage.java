package com.automationpractice.pageobjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.util.logging.Logger;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by piotroj on 2019-03-29
 */
public class LoginPage {
   private static final Logger LOG = Logger.getLogger(LoginPage.class.getName());
   private final String LOGIN_FORM_HEADER = "Already registered?";
   private SelenideElement loginFormTitle = $("#login_form .page-subheading");
   private SelenideElement emailInput = $("#login_form #email");
   private SelenideElement passwordInput = $("#login_form #passwd");
   private SelenideElement signInButton = $("#SubmitLogin");
   private SelenideElement authenticationFailedTooltip = $(".alert.alert-danger ol");
   private SelenideElement forgottenPasswordButton = $(".lost_password form-group a");

   public void signInFormAppearsAsExpected() {
      loginFormTitle.shouldHave(Condition.text(LOGIN_FORM_HEADER));
      emailInput.shouldBe(Condition.visible);
      passwordInput.shouldBe(Condition.visible);
      forgottenPasswordButton.shouldHave(Condition.text("Forgot your password?")).isDisplayed();
   }

   public void createAnAccountFormAppearsAsExpected() {
      loginFormTitle.shouldHave(Condition.text(LOGIN_FORM_HEADER));
      emailInput.shouldBe(Condition.visible);
      passwordInput.shouldBe(Condition.visible);
   }

   public void signInIntoApplication(String email, String password) {
      emailInput.setValue(email);
      passwordInput.setValue(password);
      signInButton.click();
   }

   public void loginAuthenticationFailedTooltipAppearsAsExpected() {
      authenticationFailedTooltip.shouldHave(Condition.text("Authentication failed.")).isDisplayed();
      LOG.info("Login Authentication failed tooltip appears as expected after login with invalid credentials");
   }

   public void emailAuthenticationFailedTooltipAppearsAsExpected() {
      authenticationFailedTooltip.shouldHave(Condition.text("Invalid email address.")).isDisplayed();
      LOG.info("Login Authentication failed tooltip appears as expected after login with invalid email");
   }
}
