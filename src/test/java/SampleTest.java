package test.java;


import main.java.pageEvents.CreateAccountFormEvents;
import main.java.pageEvents.HomePageEvents;
import main.java.pageEvents.RegisterPageEvents;
import main.java.pageObjects.CreateAccountFormElements;
import org.testng.annotations.Test;


public class SampleTest extends BaseTest{
    @Test
    public void registrationProcess() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php");
        HomePageEvents homePageEvents = new HomePageEvents();
        homePageEvents.clickOnSignInButton();
        RegisterPageEvents registerPageEvents = new RegisterPageEvents();
        registerPageEvents.createAccountShown();
        registerPageEvents.createAccountEmail();
        Thread.sleep(1000);
        registerPageEvents.clickSubmitButton();
        CreateAccountFormEvents createAccountFormEvents = new CreateAccountFormEvents();
        createAccountFormEvents.createAccountFormShown();
        createAccountFormEvents.selectGender();
        createAccountFormEvents.fillForm();
        createAccountFormEvents.submitRegistration();
        Thread.sleep(7000);
    }
}
