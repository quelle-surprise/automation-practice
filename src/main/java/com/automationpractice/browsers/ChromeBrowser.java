package com.automationpractice.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.logging.Logger;

import static com.automationpractice.utils.OSValidator.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

/**
 * Created by piotroj on 2019-03-28
 */
public class ChromeBrowser {

   private static final Logger LOG = Logger.getLogger(ChromeBrowser.class.getName());

   private static void setUpBrowserForOS() {
      File driver = null;
      if(isMac()) {
         driver = setupWebDriver("src/main/resources/drivers/mac/chromedriver");
      } else if(isWindows()) {
         driver = setupWebDriver("src/main/resources/drivers/win/chromedriver.exe");
      } else if(isLinux()) {
         driver = setupWebDriver("src/main/resources/drivers/linux/chromedriver");
      }
      System.setProperty("webdriver.chrome.driver", driver.getAbsolutePath());
   }

   private static File setupWebDriver(String driverPath) {
      return new File(driverPath);
   }

   public static void configureChromeBrowser() {
      LOG.info("Setting up Chrome browser..");
      setUpBrowserForOS();
      WebDriver driver = new ChromeDriver();
      setWebDriver(driver);
   }

   public static void shutdown() {
      LOG.info("Shutting down WebDriver");
      WebDriver driver = getWebDriver();
      driver.quit();
   }
}
