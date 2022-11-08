package main.java.pageEvents;

import com.aventstack.extentreports.Status;
import main.java.pageObjects.iFrameHomePageElements;
import main.java.utils.ElementFetch;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.sql.Timestamp;

import static test.java.BaseTest.driver;
import static test.java.BaseTest.logger;

public class iFrameHomePageEvents {
    ElementFetch elementFetch = new ElementFetch();

    public void iFrameShown(){
        elementFetch.getWebElement("CSS", iFrameHomePageElements.textBoxIFrame).isDisplayed();
    }
    public void typeiFrame(){
        driver.switchTo().frame(0);
        elementFetch.getWebElement("CSS", iFrameHomePageElements.iFrameID).sendKeys("Automation Test Example");
//        elementFetch.getWebElement("CSS", iFrameHomePageElements.iFrameID).sendKeys(Keys.CONTROL + "A");
    }
    public void selectAutomationTextMakeItBoldAndUnderline(){
        int automationTextLen = 10;
        int testTextLen = 4;
        elementFetch.getWebElement("CSS", iFrameHomePageElements.iFrameID).sendKeys(Keys.HOME);

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.LEFT_SHIFT);
        for (int i = 0; i < automationTextLen; i++){
            actions.sendKeys(Keys.ARROW_RIGHT);
        }
        actions.keyUp(Keys.LEFT_SHIFT);
        actions.build().perform();

        driver.switchTo().defaultContent();
        elementFetch.getWebElement("ID", iFrameHomePageElements.iFrameBold).click();

        actions.sendKeys(Keys.ARROW_RIGHT);
        actions.sendKeys(Keys.ARROW_RIGHT);

        driver.switchTo().frame(0);
        actions.keyDown(Keys.LEFT_SHIFT);
        for(int i = 0; i<testTextLen; i++) {
            actions.sendKeys(Keys.ARROW_RIGHT);
        }
        actions.keyUp(Keys.LEFT_SHIFT);
        actions.build().perform();

        driver.switchTo().defaultContent();
        elementFetch.getWebElement("ID", iFrameHomePageElements.iFrameUnderline).click();
        driver.switchTo().frame(0);
        elementFetch.getWebElement("CSS", iFrameHomePageElements.iFrameID).sendKeys(Keys.END);
        driver.switchTo().defaultContent();
    }

    public void getiFrameText() {
        driver.switchTo().frame(0);
        String text = elementFetch.getWebElement("CSS", iFrameHomePageElements.iFrameText).getText();
        System.out.println("This is my text inside text editor: "+text);
        if(text != "Automation Test Example"){
            logger.log(Status.FAIL, "Text is not matching!");
        }
        else
            logger.log(Status.PASS, "All good!");
        driver.switchTo().defaultContent();
    }

}
