package org.StepDefinition;

import io.cucumber.java.en.Then;
import org.utilities.BaseClass;
import org.Locators.AppSetupPojo;

import java.net.MalformedURLException;

public class AppLaunch extends BaseClass {
    AppSetupPojo app;

    @Then("To launch the {string} app using device with udid {string}")
    public void to_launch_the_app_using_device_with_udid(String appName, String udid) throws MalformedURLException {
LaunchApp(appName,udid);
    }

    @Then("To check whether the app update notification popup is displayed and enable it")
    public void to_check_whether_the_app_update_notification_popup_is_displayed_and_enable_it() {
    app = new AppSetupPojo();
    Click(app.getYesNotifyButton(),10);
    Click(app.getAllowNotificationSystemButton(),10);
    }
    @Then("To check whether the AppUpdate Popup is displaying and click i will do it later button")
    public void to_check_whether_the_app_update_popup_is_displaying_and_click_i_will_do_it_later_button() throws InterruptedException {
        sleep(2000);
        try {
            if (app.getNewVersionPopUpScreen().isDisplayed()) {
                Click(app.getPopUpWillDoItLaterButton(),10);
                System.out.println("App update popup displayed. Clicked 'I will do it later'.");
            }
        } catch (Exception e) {
            System.out.println("App update popup not displayed. Proceeding to next action.");
        }
    }
    }


