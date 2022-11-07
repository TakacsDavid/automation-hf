package main.java.pageEvents;

import main.java.pageObjects.HomePageElements;
import main.java.utils.ElementFetch;

public class HomePageEvents {
    ElementFetch elementFetch = new ElementFetch();
    public void clickOnSignInButton(){
        elementFetch.getWebElement("CLASS", HomePageElements.signInButton).click();
    }
}
