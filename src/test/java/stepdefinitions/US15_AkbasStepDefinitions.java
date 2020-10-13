package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;


public class US15_AkbasStepDefinitions {

    MainPage mainPage = new MainPage();

    @Given("user is on the main page")
    public void user_is_on_the_main_page() {
        Driver.getDriver().get("https://glbtrader.com/");
    }

    @When("user clicks cell phone tab from menu")
    public void user_clicks_cell_phone_tab_from_menu() {
        mainPage.cellPhoneTab.click();

    }

    @Then("user should see mobile phone option")
    public void user_should_see_mobile_phone_option() {


    }

}
