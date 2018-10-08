package stepDefinitions;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import utils.DriverFactory;

public class Example extends DriverFactory {

    @Given("^User Opens google$")
    public void user_Opens_google()   {
        getDriver().get("Https:google.com");
    }

    @Then("^verifies google is opened successfully$")
    public void verifies_google_is_opened_successfully()   {
        Assert.assertTrue(getDriver().getTitle().contains("Google"));
    }

    public void checkWebElement(){
        getDriver().findElement(By.xpath(""));
    }

}
