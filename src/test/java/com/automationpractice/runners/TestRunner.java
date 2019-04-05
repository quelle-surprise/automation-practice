package com.automationpractice.runners;

import com.automationpractice.browsers.ChromeBrowser;
import org.junit.AfterClass;
import org.junit.BeforeClass;

/**
 * Created by piotroj on 2019-03-28
 */
public class TestRunner {

   /**
    * Test runner is hardcoded only for Chrome browser,
    * in future support for another browser will be added
    * TODO -> add support for another browsers
    */
   @BeforeClass
   public static void setUp() {
      ChromeBrowser.configureChromeBrowser();
   }

   @AfterClass
   public static void tearDown() {
      ChromeBrowser.shutdown();
   }

}
