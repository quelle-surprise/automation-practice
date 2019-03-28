package com.automationpractice.utils;

/**
 * Created by piotroj on 2019-03-28
 */
public class OSValidator {

   public static boolean isWindows() {
      return System.getProperty("os.name").toLowerCase().contains("win");
   }

   public static boolean isMac() {
      return System.getProperty("os.name").toLowerCase().contains("mac");
   }

   public static boolean isLinux() {
      return System.getProperty("os.name").toLowerCase().contains("linux");
   }
}
