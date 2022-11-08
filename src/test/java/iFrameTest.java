package test.java;

import main.java.pageEvents.iFrameHomePageEvents;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class iFrameTest extends BaseTest{
        @Test
        public void iFrameTest() throws InterruptedException {
            driver.get("https://onlinehtmleditor.dev");
            iFrameHomePageEvents iFrameHomePageEvents = new iFrameHomePageEvents();
            iFrameHomePageEvents.iFrameShown();
            iFrameHomePageEvents.typeiFrame();
            iFrameHomePageEvents.selectAutomationTextMakeItBoldAndUnderline();
            iFrameHomePageEvents.getiFrameText();
            Thread.sleep(5000);
        }
}
