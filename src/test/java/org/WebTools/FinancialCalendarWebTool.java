package org.WebTools;

import org.Locators.FinancialCalendarWebToolPojo;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FinancialCalendarWebTool extends BaseClass {
    static FinancialCalendarWebToolPojo fc;
    private static List<Map<String, String>> extractEventDataDashBoard(List<WebElement> eventElements) {
        List<Map<String, String>> eventDataList = new ArrayList<>();

        //  System.out.println("Total Events Found: " + eventElements.size());

        for (WebElement event : eventElements) {
            String eventText = event.getText().trim();
            String[] lines = eventText.split("\n");

            String eventDate = (lines.length >= 2) ? lines[1] : "";
            String eventTitle = "";
            String eventType = "";

            for (int j = 0; j < lines.length; j++) {
                if (lines[j].trim().equalsIgnoreCase("Event title:") && j + 1 < lines.length) {
                    eventTitle = lines[j + 1];
                }
                if (lines[j].trim().equalsIgnoreCase("Event Type:") && j + 1 < lines.length) {
                    eventType = lines[j + 1];
                }
            }

            Map<String, String> eventDetails = new HashMap<>();
            eventDetails.put("Event Date", eventDate);
            eventDetails.put("Event Title", eventTitle);
            eventDetails.put("Event Type", eventType);

            eventDataList.add(eventDetails);

        }

        return eventDataList;
    }
    public static List<Map<String, String>> getFinancialCalendarEventsDataDashBoard(String url) {
        List<Map<String, String>> eventDataList = new ArrayList<>();
        driverLaunch("chrome");
        winMax();
        fetchUrl(url);
        fc = new FinancialCalendarWebToolPojo();

        try {
            if (fc.getNoUpcomingEventsText().isDisplayed()) {
                //     System.out.println("No Upcoming Events");
                //    System.out.println("Checking for past Events");
                Click(fc.getPastEventsTab(), 10);
                elementVisibilityWait(fc.getPastEvents(), 10);
//                WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
//                wait.until(ExpectedConditions.visibilityOf(fc.getPastEvents()));
                //  System.out.println("Past Events Tab has been clicked");

            }
            // Locate all elements with the given XPath
            eventDataList = extractEventDataDashBoard(fc.getAllPastEvents());
        } catch (
                Exception e) {
            //   System.out.println("Upcoming Events are present");
//        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOf(fc.getUpcomingEvents()));
            elementVisibilityWait(fc.getUpcomingEvents(), 10);
            eventDataList = extractEventDataDashBoard(fc.getAllUpcomingEvents());
        }

        webDriver.quit();
        return eventDataList;
    }


}
