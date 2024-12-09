package org.Locators;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.utilities.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AppSetupPojo extends BaseClass {
    public AppSetupPojo() {
            PageFactory.initElements(new AppiumFieldDecorator(BaseClass.driver), this);}

@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Would you like to be notified?\"]")
private WebElement notificationPopUp;

    @AndroidFindBy(xpath ="//android.widget.TextView[@text=\"Yes, keep me notified\"]" )
    private WebElement yesNotifyButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"I would like to enable it later\"]")
    private WebElement noIWouldDoLaterButton;


    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")
    private WebElement allowNotificationSystemButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_deny_button\"]")
    private WebElement dontAllowNotificationSystemButton;



    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"New Version Available!\"]")
    private WebElement newVersionPopUpScreen;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Update now\"]")
    private WebElement popUpUpdateNowButton;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"I will do it later\"]")
    private WebElement popUpWillDoItLaterButton;

    public WebElement getNotificationPopUp() {
        return notificationPopUp;
    }

    public WebElement getYesNotifyButton() {
        return yesNotifyButton;
    }

    public WebElement getNoIWouldDoLaterButton() {
        return noIWouldDoLaterButton;
    }

    public WebElement getAllowNotificationSystemButton() {
        return allowNotificationSystemButton;
    }

    public WebElement getDontAllowNotificationSystemButton() {
        return dontAllowNotificationSystemButton;
    }

    public WebElement getNewVersionPopUpScreen() {
        return newVersionPopUpScreen;
    }

    public WebElement getPopUpUpdateNowButton() {
        return popUpUpdateNowButton;
    }

    public WebElement getPopUpWillDoItLaterButton() {
        return popUpWillDoItLaterButton;
    }
}

