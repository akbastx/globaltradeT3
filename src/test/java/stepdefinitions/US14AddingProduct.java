package stepdefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MaliGlbLoginPage;
import pages.Us14Page;
import utilities.ConfigReader;
import utilities.Driver;

public class US14AddingProduct {
    Us14Page us14Page = new Us14Page();

    @When("user login as an agent seller")
    public void user_login_as_an_agent_seller() {
       us14Page.sellerSigninButton.click();
    }

    @When("user provide valid email {string}")
    public void user_provide_valid_email(String username) {
        us14Page.usernameBox.sendKeys(username);
    }

    @When("user provide valid password {string}")
    public void user_provide_valid_password(String password) {
       us14Page.passwordBox.sendKeys(password);
    }

    @Then("user access to seller's profile")
    public void user_access_to_seller_s_profile() {
        Assert.assertEquals(ConfigReader.getProperty("expected_seller_profile_title"),
                Driver.getDriver().getTitle());
    }

    @When("user clicks upload button and upload the picture")
    public void user_clicks_upload_button_and_upload_the_picture() {

    }

    @When("user provide specifications on product detail box")
    public void user_provide_specifications_on_product_detail_box() {

    }

    @When("user click add button")
    public void user_click_add_button() {

    }

    @Then("user see successful message {string}")
    public void user_see_successful_message(String string) {

    }

    @Then("verify product display under mobile phone part")
    public void verify_product_display_under_mobile_phone_part() {

    }
    @When("user click add product button")
    public void user_click_add_product_button() {

    }

}
