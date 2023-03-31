package StepDefinitations;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_LoginFeatureSteps {
    DialogContent dc=new DialogContent();

    @When("User sending Keys for Login")
    public void userSendingKeysForLogin() {
        dc.findAndSend(dc.Username, "Username");


    }

    @Then("User should Login successfully")
    public void userShouldLoginSuccessfully() {
    }

    @And("User Logout successfully")
    public void userLogoutSuccessfully() {
    }

    @When("User sending Keys for {string} and {string} click to login")
    public void userSendingKeysForAndClickToLogin(String arg0, String arg1) {
    }

    @Then("Allert massage should be displayed")
    public void allertMassageShouldBeDisplayed() {
    }
}
