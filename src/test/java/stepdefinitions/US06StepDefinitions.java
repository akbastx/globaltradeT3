package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US06Page;
import utilities.ConfigReader;
import utilities.Driver;

public class US06StepDefinitions {

    US06Page us06Page = new US06Page();

    @Given("Go to webside home page")
    public void go_to_webside_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("glb_trader_url"));
    }

    @When("Click Men Clothing & Accessories")
    public void click_Men_Clothing_Accessories() {
        us06Page.menClotAccess.click();
    }

    @Then("Click T-Shirts")
    public void click_T_Shirts() throws InterruptedException {
        Thread.sleep(2000);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(us06Page.tshirtButton).click().perform();
    }

    @Given("Check all filter options should be displayed")
    public void check_all_filter_options_should_be_displayed() throws InterruptedException {
        String actualUnisex = us06Page.unisexText.getText();
        String actualMale = us06Page.maleText.getText();
        String actualFemale = us06Page.femaleText.getText();
        String actualChilderen = us06Page.childerenText.getText();
        Thread.sleep(2000);
        Assert.assertEquals("Unisex",actualUnisex);
        Assert.assertEquals("Male",actualMale);
        Assert.assertEquals("Female",actualFemale);
        Assert.assertEquals("Children",actualChilderen);
    }

    @Given("Check  all filter options are clickable")
    public void check_all_filter_options_are_clickable() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());

        Thread.sleep(2000);
        actions.moveToElement(us06Page.unisexBox).click().perform();
        actions.moveToElement(us06Page.maleBox).click().perform();
        actions.moveToElement(us06Page.femaleBox).click().perform();
        actions.moveToElement(us06Page.childerenBox).click().perform();


        Thread.sleep(2000);
        Assert.assertTrue(us06Page.unisexBox.isSelected());
        Assert.assertTrue(us06Page.childerenBox.isSelected());
        Assert.assertTrue(us06Page.femaleBox.isSelected());
        Assert.assertTrue(us06Page.maleBox.isSelected());

    }

    @Given("Check  Male options")
    public void check_Male_options() {
        us06Page.maleBox.click();
        us06Page.filterButton.click();
    }

    @Then("See the filtered page")
    public void see_the_filtered_page() throws InterruptedException {
        Thread.sleep(2500);
        Assert.assertTrue(us06Page.maleBox.isSelected());
    }
}
