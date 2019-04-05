package com.automationpractice.utils;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;


/**
 * Created by piotroj on 2019-03-29
 */
public class Navigation {


   private SelenideElement signInBtn() { return $(".login"); }

   private SelenideElement contactUsBtn() { return $("[title='Contact Us']");}

   public void goToSignInPage() {
      signInBtn().click();
   }

   public void goToContactUsPage() {
      contactUsBtn().click();
   }

}
