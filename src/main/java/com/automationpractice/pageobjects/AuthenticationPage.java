package com.automationpractice.pageobjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.util.logging.Logger;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by piotroj on 2019-03-29
 */
public class AuthenticationPage {
   private static final Logger LOG = Logger.getLogger(LoginPage.class.getName());
   private final String LOGIN_FORM_HEADER = "Already registered?";
   private SelenideElement loginFormTitle = $("#login_form .page-subheading");
   private SelenideElement emailInput = $("#login_form #email");
   private SelenideElement passwordInput = $("#login_form #email");


   public void signInFormAppearsAsExpected() {
      loginFormTitle.shouldHave(Condition.text(LOGIN_FORM_HEADER));
      emailInput.shouldBe(Condition.visible);
   }
}
