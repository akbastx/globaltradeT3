package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;

public class GLB10_Sinan_StepDefinitions {
    MainPage homePage=new MainPage();
    @Given("customer is on the homepage")
    public void customer_is_on_the_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("glb_trader_url"));
//
    }
        @And("click on sign in")
    public void click_on_sign_in() {
            homePage.signIn.click();
        }

    @And("enter a valid email")
    public void enter_a_valid_email() {
        homePage.email.click();
        homePage.email.sendKeys(ConfigReader.getProperty("customer_email"));

    }
    @And("enter a valid password")
    public void enter_a_valid_password() {
        homePage.password.click();
        homePage.password.sendKeys(ConfigReader.getProperty("customer_password"));

    }
    @And("user click login button")
    public void user_click_login_button() {
        homePage.login.click();

    }
    @And("search apple in search box")
    public void search_apple_in_search_box() {
        homePage.searchbox.click();
        homePage.searchbox.sendKeys("Apple Ipad");
        homePage.searchLogo.click();

    }
    @And("click on apple image")
    public void click_on_apple_image() {
        homePage.appleIpad.click();

    }

    @Then("Then click on 256GB option and verify info")
    public void then_click_on_256GB_option_and_verify_info()  {
        homePage.gb256.click();
        Assert.assertEquals("Apple iPad Pro (256GB, Wi-Fi + Cellular, Space Gray) 12.9-inch Display",homePage.infoText);

    }
    @Then("click on 32GB option and verify info")
    public void click_on_32GB_option_and_verify_info() {
        homePage.gb32.click();
        Assert.assertEquals("Apple iPad Pro (32GB, Wi-Fi + Cellular, Space Gray) 12.9-inch Display",homePage.infoText);
    }
    @Then("click on 64GB option and verify info")
    public void click_on_64GB_option_and_verify_info() {
        homePage.gb64.click();
        Assert.assertEquals("Apple iPad Pro (64GB, Wi-Fi + Cellular, Space Gray) 12.9-inch Display",homePage.infoText);

    }
    @Then("click on 128GB option and verify info")
    public void click_on_128GB_option_and_verify_info() {
        homePage.gb128.click();
        Assert.assertEquals("Apple iPad Pro (128GB, Wi-Fi + Cellular, Space Gray) 12.9-inch Display",homePage.infoText);

    }

}