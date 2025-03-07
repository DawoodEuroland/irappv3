package org.utilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.Locators.LoginPojo;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class BaseClass {
    public static AndroidDriver driver;
   public static WebDriverWait wait;
    public static void LaunchApp(String app, String udid) throws MalformedURLException {
        // Fetch the app package dynamically
        String appPackage = AppConfig.getAppPackage(app);

        // Common app activity for all apps
        String appActivity = "com.euroland.irappv3.MainActivity";

        // Setup desired capabilities
        UiAutomator2Options options = new UiAutomator2Options()
                .setUdid(udid)
                .setAppPackage(appPackage)
                .setAppActivity(appActivity)
                .setNoReset(false) // Adjust as per your needs
                .autoGrantPermissions()
                .setNewCommandTimeout(Duration.ofMinutes(3));

        // Initialize the AndroidDriver
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
    }
    public static void sleep(int milli) throws InterruptedException {
        Thread.sleep(milli);
    }
    public static void Click(WebElement element, int timeoutInSeconds) {
         wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();

    }
    public static void sendValues(WebElement element, String value,int timeoutInSeconds,int milli) {

        FluentWait<AndroidDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(timeoutInSeconds))    // Max timeout
                .pollingEvery(Duration.ofMillis(milli))    // Polling interval
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(value);
    }
    public static void close() {
        if (driver != null) {
            try {
                driver.quit();
            } catch (Exception e) {
                e.printStackTrace();  // Log any exceptions for easier debugging
            }
        }
    }
    public static void verifyLoginSuccess(String loginmethod, LoginPojo login) throws InterruptedException {
        try {
            // Check for Good Morning message
            if (login.getMorningMessage().isDisplayed()) {
                System.out.println("User login Successful using : " + loginmethod);
            }
        } catch (org.openqa.selenium.NoSuchElementException e) {
            // If the Good Morning message is not found, check for Good Afternoon message
            try {
                if (login.getAfternoonMessage().isDisplayed()) {
                    System.out.println("User login Successful using : " + loginmethod);
                }
            } catch (org.openqa.selenium.NoSuchElementException ex) {
//                 If the Good Afternoon message is also not found, check for Good Evening message
                try {
                    if (login.getEveMessage().isDisplayed()) {
                        System.out.println("User login Successful using : " + loginmethod);
                    }
                } catch (org.openqa.selenium.NoSuchElementException ex2) {
                    System.out.println("User login failed using : " + loginmethod);
                }




            }
        }
    }

    public static void swipeUsingText(String text){
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"" + text + "\"))"));
    }







}
