package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import pageObjects.BasePage;
import utils.DriverFactory;

import java.io.IOException;


public class BasePagechecks extends BasePage {


    public BasePagechecks() throws IOException {
    }

    @Given("^User Opens website$")
    public void user_Opens_website() throws Throwable {
        getDriver().get("http://webdriveruniversity.com/");
    }
    @Given("^User navigates to LoginPortal$")
    public void user_navigates_to_LoginPortal() throws Throwable {
        scrollToElementByWebElementLocator(driver.findElement(By.id("login-portal")));
        waitUntilPreLoadElementDissapears(By.id(""));
    }

    @Given("^user clicks user name$")
    public void user_clicks_user_name() throws Throwable {

    }
}
