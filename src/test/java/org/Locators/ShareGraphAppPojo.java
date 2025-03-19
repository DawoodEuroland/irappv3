package org.Locators;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ShareGraphAppPojo extends BaseClass{

    public ShareGraphAppPojo() {

        PageFactory.initElements(new AppiumFieldDecorator(BaseClass.driver), this);

    }
    public WebElement getLastPriceWithCurrencyValue(String lastpriceCurrency){
        return driver.findElement(By.xpath("//android.widget.TextView[contains(@text, '" + lastpriceCurrency + "')]"));

    }
    public WebElement getHighValue(String high){
        return driver.findElement(By.xpath("//android.widget.TextView[contains(@text, '" + high + "')]"));

    }
    public WebElement getLowValue(String low){
        return driver.findElement(By.xpath("//android.widget.TextView[contains(@text, '" + low + "')]"));

    }
    public WebElement getChangeValue(String change){
        return driver.findElement(By.xpath("//android.widget.TextView[contains(@text, '" + change + "')]"));

    }
    public WebElement getChangePercentValue(String changePercent){
        return driver.findElement(By.xpath("//android.widget.TextView[contains(@text, '" + changePercent + "')]"));

    }
    public WebElement getVolumeValue(String volume){
        return driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='Volume," + volume + "']"));

    }


}
