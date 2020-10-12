package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.US15CellComPage;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class US15CellComStepDefinitions {
    US15CellComPage us15CellComPage = new US15CellComPage();

    @Given("user is on the Global Trader page")
    public void user_is_on_the_global_trader_page() {
        Driver.getDriver().get(ConfigReader.getProperty("glb_trader_url"));
    }

    @When("user hover over Cellphone & Communication under Categories")
    public void user_hover_over_cellphone_communication_under_categories() throws InterruptedException {
        Thread.sleep(5000);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(us15CellComPage.cellphoneAndCommunicationsMenu).perform();
        Thread.sleep(5000);
    }

    @When("user see all option on dropdown menu")
    public void user_see_all_option_on_dropdown_menu() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(us15CellComPage.cellphoneAndCommunicationsMenu).click().perform();
        assertTrue(us15CellComPage.wallet.isDisplayed());
    }

    @When("user clicks on Wallet Cases")
    public void user_clicks_on_wallet_cases() {
        us15CellComPage.wallet.click();
    }

    @When("verify Products on the page")
    public void verify_products_on_the_page() {
        assertTrue(us15CellComPage.product.isDisplayed());
    }

    @Then("verify Design Filter on the page")
    public void verify_design_filter_on_the_page() {
        assertTrue(us15CellComPage.designFilter.isDisplayed());
    }

    @When("select each option from design filter")
    public void select_each_option_from_design_filter() {
        us15CellComPage.exoticCheckBox.click();
        us15CellComPage.geometricCheckBox.click();
        us15CellComPage.jewelledCheckBox.click();
        us15CellComPage.sportsCheckBox.click();
        us15CellComPage.vintageCheckBox.click();
    }

    @Then("verify options are selected")
    public void verify_options_are_selected() {
        assertTrue(us15CellComPage.vintageCheckBox.isSelected());
        assertTrue(us15CellComPage.sportsCheckBox.isSelected());
        assertTrue(us15CellComPage.exoticCheckBox.isSelected());
        assertTrue(us15CellComPage.geometricCheckBox.isSelected());
        assertTrue(us15CellComPage.jewelledCheckBox.isSelected());
    }

    @When("user select Business option from Design filter")
    public void user_select_business_option_from_design_filter() {
        us15CellComPage.businessCheckBox.click();
        assertTrue(us15CellComPage.businessCheckBox.isSelected());
    }
    @When("user clicks design search button")
    public void user_clicks_design_search_button() {
        us15CellComPage.designFilterButton.click();
    }

    @Then("verify products under Business option")
    public void verify_products_under_business_option() {
        Assert.assertTrue(us15CellComPage.businessProduct.isDisplayed());
        Driver.closeDriver();
    }



}
