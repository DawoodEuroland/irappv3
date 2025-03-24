package org.Locators;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class FinancialCalendarAppPojo extends BaseClass {
    public FinancialCalendarAppPojo() {
        PageFactory.initElements(new AppiumFieldDecorator(BaseClass.driver), this);}


    public WebElement getEventDate(String date) {
        String formattedDate = date;

        // Check if the date contains a space but not a slash, meaning it needs formatting
        if (date.contains(" ") && !date.contains("/")) {
            formattedDate = date.replace(" ", "/"); // Convert "Nov 2024" to "Nov/2024"
        }

        return driver.findElement(By.xpath("//android.widget.TextView[contains(@text, '" + formattedDate + "')]"));
    }

    public WebElement getEventType(String type){
        return driver.findElement(By.xpath("//android.widget.TextView[contains(translate(normalize-space(@text), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '"      + type.toLowerCase() + "')]"));
    }
    public WebElement getEventTitle(String title){
        return driver.findElement(By.xpath("//android.widget.TextView[contains(normalize-space(@text), '" + title + "')]"));
    }

}
