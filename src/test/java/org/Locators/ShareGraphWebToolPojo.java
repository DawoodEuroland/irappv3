package org.Locators;

import org.utilities.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShareGraphWebToolPojo extends BaseClass {
    public ShareGraphWebToolPojo(){
        PageFactory.initElements(webDriver,this);
    }
    @FindBy(xpath = "//td[@title='Last']")
    private WebElement lastPrice;

    @FindBy(xpath = "//td[@class='TickerValueTD TickerValueTD_High']")
    private WebElement highPrice;

    @FindBy(xpath = "//td[@class='TickerValueTD TickerValueTD_Low']")
    private WebElement lowPrice;

    @FindBy(xpath = "//td[@title='(+/-)']")
    private WebElement change;

    public WebElement getLastPrice() {
        return lastPrice;
    }

    public WebElement getHighPrice() {
        return highPrice;
    }

    public WebElement getLowPrice() {
        return lowPrice;
    }

    public WebElement getChange() {
        return change;
    }

    public WebElement getChangePercentage() {
        
        return changePercentage;
    }

    public WebElement getVolume() {
        
        return volume;
    }

    public WebElement getShareDataLink() {
        
        return shareDataLink;
    }

    public WebElement getCurrencyElement() {
        return currencyElement;
    }

    @FindBy(xpath = "//td[@title='%']")
    private WebElement changePercentage;

    @FindBy(xpath = "//td[@title='Volume']")
    private WebElement volume;

    @FindBy(xpath = "//a[@id=\"lbtShare\"]")
    private WebElement shareDataLink;

    @FindBy(xpath = "//td[@title='Currency']")
    private WebElement currencyElement;


}
