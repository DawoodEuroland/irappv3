package org.StepDefinition;

import io.cucumber.java.en.Then;
import org.utilities.AppConfig;
import org.utilities.BaseClass;
import org.WebTools.ShareGraphWebTool;
import org.Locators.ShareGraphAppPojo;

import java.util.Map;

public class DashBoard extends BaseClass {
    ShareGraphAppPojo sgApp;
    Map<Integer, String> tickervalues;

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
}
