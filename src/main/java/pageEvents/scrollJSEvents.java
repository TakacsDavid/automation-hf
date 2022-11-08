package main.java.pageEvents;

import main.java.pageObjects.scrollJSElements;
import main.java.utils.ElementFetch;

public class scrollJSEvents {
    ElementFetch elementFetch = new ElementFetch();
    public void contentShown(){
        elementFetch.getWebElement("ID", scrollJSElements.contentID).isDisplayed();
    }
}
