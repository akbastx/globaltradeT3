package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class GLB03_Sinan_StepDefinitions {
    MainPage homePage=new MainPage();
    @Given("user is on the homepage")
    public void user_is_on_the_homepage(){
        Driver.getDriver().get(ConfigReader.getProperty("glb_trader_url"));
    }
    @And("user click seller sign in")
    public void  user_click_seller_sign_in(){
        homePage.sellerSignin.click();
    }
    @And("user enter email")
    public void user_enter_email(){
        homePage.usernamebox.click();
        homePage.usernamebox.sendKeys(ConfigReader.getProperty("seller_username"));
        //
    }
    @And("user enter password")
    public void user_enter_password(){
        homePage.passwordbox.click();
        homePage.passwordbox.sendKeys(ConfigReader.getProperty("seller_password"));
    }
    @And("user click on log in button")
    public void user_click_in_log_in_button(){
        homePage.logInButton.click();
    }


    @And("user on the homepage")
    public void user_on_the_homepage() {
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();
    }


    @When("click on jewelry accessories")
    public void click_on_jewelry_accessories() {
        homePage.jewelryAccessories.click();

    }
    @Then("verify is visible the all options under jewelery accessories")
    public void verify_is_visible_the_all_options_under_jewelery_accessories(){
       Assert.assertTrue(homePage.earrings.isDisplayed());
        Assert.assertTrue(homePage.wedding.isDisplayed());
        Assert.assertTrue(homePage.fineJewelry.isDisplayed());
        Assert.assertTrue(homePage.beadsJewelry.isDisplayed());
        Assert.assertTrue(homePage.necklacesPendants.isDisplayed());
        Assert.assertTrue(homePage.rings.isDisplayed());
        Assert.assertTrue(homePage.braceletsBangles.isDisplayed());
        Assert.assertTrue(homePage.jewelrySetsMore.isDisplayed());
    }
}
