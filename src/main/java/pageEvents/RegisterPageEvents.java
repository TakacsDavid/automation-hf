package main.java.pageEvents;

import main.java.pageObjects.HomePageElements;
import main.java.pageObjects.RegisterPageElements;
import main.java.utils.ElementFetch;

import java.sql.Timestamp;

public class RegisterPageEvents {
    ElementFetch elementFetch = new ElementFetch();
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());

    public void createAccountShown(){
        elementFetch.getWebElement("ID", RegisterPageElements.createAccountID).isDisplayed();
    }
    public void createAccountEmail(){
        elementFetch.getWebElement("ID", RegisterPageElements.createAccountNameID).sendKeys("takactz+"+timestamp.getTime()+"@gmail.com");
    }
    public void clickSubmitButton(){
        elementFetch.getWebElement("ID", RegisterPageElements.submitButtonID).click();
    }
}
