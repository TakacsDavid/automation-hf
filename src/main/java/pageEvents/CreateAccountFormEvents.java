package main.java.pageEvents;

import main.java.pageObjects.CreateAccountFormElements;
import main.java.utils.ElementFetch;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import test.java.BaseTest;

import static test.java.BaseTest.driver;

public class CreateAccountFormEvents {
    ElementFetch elementFetch = new ElementFetch();
    public void createAccountFormShown(){
        elementFetch.getWebElement("ID", CreateAccountFormElements.createAccountFormID).isDisplayed();
    }
    public void selectGender(){
        elementFetch.getWebElement("ID", CreateAccountFormElements.genderID).click();
    }

    public void fillForm(){
        Select birthDaysDrp = new Select(driver.findElement(By.id(CreateAccountFormElements.birthDay)));
        Select birthMonthsDrp = new Select(driver.findElement(By.id(CreateAccountFormElements.birthMonth)));
        Select birthYearsDrp = new Select(driver.findElement(By.id(CreateAccountFormElements.birthYear)));
        Select stateDrp = new Select(driver.findElement(By.id(CreateAccountFormElements.stateID)));
        Select countryDrp = new Select(driver.findElement(By.id(CreateAccountFormElements.countryID)));
        elementFetch.getWebElement("ID", CreateAccountFormElements.firstNameID).sendKeys("David");
        birthDaysDrp.selectByIndex(1);
        birthMonthsDrp.selectByIndex(1);
        birthYearsDrp.selectByIndex(1);
        elementFetch.getWebElement("ID", CreateAccountFormElements.lastNameID).sendKeys("Takacs");
        elementFetch.getWebElement("ID", CreateAccountFormElements.passwordID).sendKeys("Asdqwe123.");
/*
        Nem kell megint beírni, kitölti helyettem firstNameID, lastNameID után..

        elementFetch.getWebElement("ID", CreateAccountFormElements.addressFirstNameID).sendKeys("David");
        elementFetch.getWebElement("ID", CreateAccountFormElements.addressLastNameID).sendKeys("Takacs");
 */
        elementFetch.getWebElement("ID", CreateAccountFormElements.companyNameID).sendKeys("Secret");
        elementFetch.getWebElement("ID", CreateAccountFormElements.addressCompanyID).sendKeys("Helloworld 5");
        countryDrp.selectByIndex(1);
        stateDrp.selectByVisibleText("Alaska");
        elementFetch.getWebElement("ID", CreateAccountFormElements.cityID).sendKeys("Budapest");
        elementFetch.getWebElement("ID", CreateAccountFormElements.postcodeID).sendKeys("12345");
        elementFetch.getWebElement("ID", CreateAccountFormElements.phoneID).sendKeys("3456028");
        elementFetch.getWebElement("ID", CreateAccountFormElements.mobileID).sendKeys("+3655499977");
        elementFetch.getWebElement("ID", CreateAccountFormElements.addressAliasID).sendKeys("");
    }
    public void submitRegistration(){
        elementFetch.getWebElement("ID", CreateAccountFormElements.submitRegistrationID).click();
    }

}
