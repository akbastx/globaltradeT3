package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.EngagementRPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US05_MB_VerifyEngagementRing_StepDefinitions {

     EngagementRPage engagementRPage = new EngagementRPage();

    @When("Go to website home page")
    public void go_to_website_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("glb_trader_url"));

    }

    @When("click on Jewelry&Accessories")
    public void click_on_Jewelry_Accessories() {
        engagementRPage.jewelryAccessories.click();

    }

    @When("hoverover Jewelry&Accessories")
    public void hoverover_Jewelry_Accessories() {

//        Actions actions = new Actions(Driver.getDriver());
//        actions.sendKeys(Keys.PAGE_DOWN).perform();
//

    }

    @Then("verify wedding & Engagement jewelry option is displayed")
    public void verify_wedding_Engagement_jewelry_option_is_displayed() {
        engagementRPage.weddingEngagement.isDisplayed();


    }


    @Then("click on wedding&Engagement jewelry")
    public void clickOnWeddingEngagementJewelry()  {
        engagementRPage.weddingEngagement.click();
        engagementRPage.engagementRing.click();



    }


    @And("verify Engagement Rings option is displayed")
    public void verifyEngagementRingsOptionIsDisplayed() {
        String expectedText ="Record Not Found";
      String actualText = engagementRPage.verifyRing.getText();
        Assert.assertTrue(actualText.contains(expectedText));

    }


}
