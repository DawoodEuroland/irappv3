package org.WebTools;

import org.Locators.AppSetupPojo;
import org.Locators.ShareGraphWebToolPojo;
import org.utilities.BaseClass;

import java.util.LinkedHashMap;
import java.util.Map;


public class ShareGraphWebTool extends BaseClass {
    static ShareGraphWebToolPojo sg;
    public static Map<Integer,String> getTickerDataFromShareGraphWebTool(String url){
        driverLaunch("chrome");
        winMax();
        fetchUrl(url);
        sg = new ShareGraphWebToolPojo();
        Map<Integer, String> tickerData = new LinkedHashMap<>();
        String last = getTextValuesBrowser(sg.getLastPrice());
        tickerData.put(1,getTextValuesBrowser(sg.getHighPrice()));
        tickerData.put(2,getTextValuesBrowser(sg.getLowPrice()));
        tickerData.put(3,getTextValuesBrowser(sg.getChange()));
        tickerData.put(4,getTextValuesBrowser(sg.getChangePercentage()));
        tickerData.put(5,getTextValuesBrowser(sg.getVolume()));
        Click(sg.getShareDataLink(),10);
        tickerData.put(6,last+" "+getTextValuesBrowser(sg.getCurrencyElement()));
     closeBrowser();
        return tickerData;
    }

}
