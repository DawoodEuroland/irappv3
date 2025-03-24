package org.StepDefinition;

import io.cucumber.java.en.Then;
import org.Locators.FinancialCalendarAppPojo;
import org.WebTools.FinancialCalendarWebTool;
import org.utilities.AppConfig;
import org.utilities.BaseClass;
import org.WebTools.ShareGraphWebTool;
import org.Locators.ShareGraphAppPojo;

import java.util.List;
import java.util.Map;

public class DashBoard extends BaseClass {
    ShareGraphAppPojo sgApp;
    FinancialCalendarAppPojo fcApp;
    Map<Integer, String> tickervalues;
    List<Map<String, String>> FcEventsData;

    @Then("To launch the share graph web link of that company and gets the ticker data and store it")
    public void to_launch_the_share_graph_web_link_of_that_company_and_gets_the_ticker_data_and_store_it() {
        tickervalues = ShareGraphWebTool.getTickerDataFromShareGraphWebTool(AppConfig.getShareGraphLink(AppLaunch.appname));

    }

    @Then("To check whether the last price along with currency of the company matches with the web tool")
    public void to_check_whether_the_last_price_along_with_currency_of_the_company_matches_with_the_web_tool() {
        sgApp = new ShareGraphAppPojo();
        System.out.println("Last Price Value matches with WebTool : " + sgApp.getLastPriceWithCurrencyValue(tickervalues.get(6)).isDisplayed());
    }

    @Then("To check whether the high price matches with the web tool")
    public void to_check_whether_the_high_price_matches_with_the_web_tool() {
        System.out.println("High Value matches with WebTool : " + sgApp.getHighValue(tickervalues.get(1)).isDisplayed());

    }

    @Then("To Check whether the low price matches with the web tool")
    public void to_check_whether_the_low_price_matches_with_the_web_tool() {
        System.out.println("Low Value matches with WebTool : " + sgApp.getLowValue(tickervalues.get(2)).isDisplayed());

    }

    @Then("To check whether the change and change percent value matches with the web tool")
    public void to_check_whether_the_change_and_change_percent_value_matches_with_the_web_tool() {
        System.out.println("Change Value matches with WebTool : " + sgApp.getChangeValue(tickervalues.get(3)).isDisplayed());
        System.out.println("Change Percent Value matches with WebTool : " + sgApp.getChangePercentValue(tickervalues.get(4)).isDisplayed());

    }

    @Then("To check whether the volume matches with the web tool")
    public void to_check_whether_the_volume_matches_with_the_web_tool() {
        System.out.println("Volume Value matches with WebTool : " + sgApp.getVolumeValue(tickervalues.get(5)).isDisplayed());

    }

    @Then("To launch the Financial calendar web link of that Company and gets the events data and store it")
    public void to_launch_the_financial_calendar_web_link_of_that_company_and_gets_the_events_data_and_store_it() {
        FcEventsData = FinancialCalendarWebTool.getFinancialCalendarEventsDataDashBoard(AppConfig.getFinancialCalendarLink(AppLaunch.appname));
    }

    @Then("To check whether the Mobile App's Event Data matches with the Data from the Web tool")
    public void to_check_whether_the_mobile_app_s_event_data_matches_with_the_data_from_the_web_tool() throws InterruptedException {
        fcApp = new FinancialCalendarAppPojo();
        int EventsSize = FcEventsData.size();
        System.out.println("Number of Events Displayed : " + EventsSize);
        halfSwipeDown();
        for (int i = 0; i < EventsSize; i++) {

            fcApp.getEventDate(FcEventsData.get(i).get("Event Date")).isDisplayed();
            fcApp.getEventTitle(FcEventsData.get(i).get("Event Title")).isDisplayed();
            fcApp.getEventType(FcEventsData.get(i).get("Event Type")).isDisplayed();
            sleep(2000);
            System.out.println("Financial Event in the App : " + (i + 1) + " Matches with the Web Tool");
            fullScrollForwardHorizontal();
        }

    }
}