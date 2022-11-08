package test.java;

import main.java.pageEvents.iFrameHomePageEvents;
import main.java.pageEvents.scrollJSEvents;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class scrollTest extends BaseTest{
    @Test
    public void iFrameTest() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/");
        scrollJSEvents scrollJSEvents = new scrollJSEvents();
        scrollJSEvents.contentShown();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)", "");
        Thread.sleep(5000);
    }
}