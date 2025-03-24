package org.Locators;

import org.utilities.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FinancialCalendarWebToolPojo extends BaseClass {
    public FinancialCalendarWebToolPojo(){
        PageFactory.initElements(webDriver,this);
    }
    @FindBy(xpath = "//a[@id=\"pastEventsTabItem\"]")
    private WebElement pastEventsTab;

    public WebElement getNoUpcomingEventsText() {
        return noUpcomingEventsText;
    }

    public WebElement getPastEventsTab() {
        return pastEventsTab;
    }
    @FindBy(xpath = "//div[text()=\"Upcoming events to be announced\"]")
    private WebElement noUpcomingEventsText;

    @FindBy(xpath = "//div[@class='events-container']//div[@class=\"events-view\"]//div[@id=\"UpcomingEventsContainer\"]//div[contains(@class, 'content-headline')]")
    private WebElement upcomingEvents;

    @FindBy(xpath = "//div[@class='events-container']//div[@class=\"events-view\"]//div[@id=\"UpcomingEventsContainer\"]//div[contains(@class, 'content-headline')]")
    private List <WebElement> allUpcomingEvents;

    @FindBy(xpath = "//div[@class='events-container']//div[@class=\"events-view\"]//div[@id=\"PastEventsContainer\"]//div[contains(@class, 'content-headline')]")
    private WebElement pastEvents;

    @FindBy(xpath = "//div[@class='events-container']//div[@class=\"events-view\"]//div[@id=\"PastEventsContainer\"]//div[contains(@class, 'content-headline')]")
    private List <WebElement> allPastEvents;

    public WebElement getUpcomingEvents() {
        return upcomingEvents;
    }

    public List<WebElement> getAllUpcomingEvents() {
        return allUpcomingEvents;
    }

    public WebElement getPastEvents() {
        return pastEvents;
    }

    public List<WebElement> getAllPastEvents() {
        return allPastEvents;
    }
}
