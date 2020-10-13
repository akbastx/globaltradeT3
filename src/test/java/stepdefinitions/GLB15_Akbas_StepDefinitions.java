package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MainPage;
import pages.MobilePhonesPage;
import utilities.ConfigReader;
import utilities.Driver;


public class GLB15_Akbas_StepDefinitions {

    MainPage mainPage = new MainPage();
    MobilePhonesPage mobilePhonesPage = new MobilePhonesPage();

    @Given("user is on the main page")
    public void user_is_on_the_main_page() {
        Driver.getDriver().get(ConfigReader.getProperty("glb_trader_url"));
    }


    @When("user clicks cell phone tab from menu")
    public void user_clicks_cell_phone_tab_from_menu() {
        mainPage.cellPhoneTab.click();

    }

    @Then("user should see mobile phone option")
    public void user_should_see_mobile_phone_option() throws InterruptedException {
        String actual= mainPage.mobilePhone.getText().toLowerCase();
        Assert.assertTrue(actual.contains("mobile phones"));
        System.out.println(actual);

    }

    @When("User should reach mobile phone page")
    public void user_should_reach_mobile_phone_page() {
        mainPage.cellPhoneTab.click();
        mainPage.mobilePhone.click();
    }

    @Then("should see all product")
    public void should_see_all_product() throws InterruptedException {
        String actual= mobilePhonesPage.products.getText().toLowerCase();

        Assert.assertTrue(actual.contains("products"));

        System.out.println(actual);

    }


}

