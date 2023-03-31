package StepDefinitations;

import Pages.RegisterPages;
import Utilities.GrWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class _01_RegisterFunctionalitySteps extends GrWD {

    RegisterPages rp=new RegisterPages();
    @Given("Navigate to site")
    public void navigateToSite() {
        GrWD.getDriver().get(" https://parabank.parasoft.com/parabank/index.htm");



    }

    @When("User sending Keys for Register")
    public void userSendingKeysForRegister() {
        rp.clickFunction(rp.registerBtn);
        rp.findAndSend(rp.FirstName,"Muhammed Enes");
        rp.findAndSend(rp.LastName,"Erol");
        rp.findAndSend(rp.Address,"Fevzipaşa Mah.Dizdar Geçidi No:17");
        rp.findAndSend(rp.City,"Çanakkale");
        rp.findAndSend(rp.State,"Marmara");
        rp.findAndSend(rp.ZipCode,"59860");
        rp.findAndSend(rp.Phone,"02821159860");
        rp.findAndSend(rp.SSN,"99881212112");
        rp.findAndSend(rp.Username,"MECorlu");
        rp.findAndSend(rp.Password,"Corlu860");
        rp.findAndSend(rp.repeatPassword,"Corlu860");
        rp.clickFunction(rp.Confirm);


    }

    @Then("User should register successfully")
    public void userShouldRegisterSuccessfully() {

        Assert.assertTrue(rp.successMessage.isDisplayed(),"test failed");

    }
}
