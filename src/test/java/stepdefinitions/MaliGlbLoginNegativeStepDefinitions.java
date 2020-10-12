package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MaliGlbLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class MaliGlbLoginNegativeStepDefinitions {
   MaliGlbLoginPage maliGlbLoginPage = new MaliGlbLoginPage();
    @When("user fill out all fields except one mandatory field")
    public void user_fill_out_all_fields_except_one_mandatory_field() {
        maliGlbLoginPage.agentFullName.sendKeys(ConfigReader.getProperty("agent_name"));
        maliGlbLoginPage.agentMail.sendKeys(ConfigReader.getProperty("agent_email"));
        maliGlbLoginPage.agentSubDomain.sendKeys(ConfigReader.getProperty("agent_subdomain"));
        maliGlbLoginPage.agentMobile.sendKeys(ConfigReader.getProperty("agent_mobile"));
        Select select = new Select(maliGlbLoginPage.country);
        select.selectByVisibleText(ConfigReader.getProperty("agent_country"));
        maliGlbLoginPage.agentState.sendKeys(ConfigReader.getProperty("agent_state"));
        maliGlbLoginPage.agentCity.sendKeys(ConfigReader.getProperty("agent_city"));
        maliGlbLoginPage.agentAddress.sendKeys(ConfigReader.getProperty("agent_address"));
        maliGlbLoginPage.agentPostCode.sendKeys(ConfigReader.getProperty("agent_postal_code"));
        Select select1 = new Select(maliGlbLoginPage.category);
        select1.selectByVisibleText(ConfigReader.getProperty("agent_category"));
        maliGlbLoginPage.agentPassword.sendKeys("");
    }
    @Then("verify message You can not leave required field blank! Please try again.")
    public void verify_message_you_can_not_leave_required_field_blank_please_try_again() {
        Assert.assertEquals(maliGlbLoginPage.redPasswordBox.getText(),
                ConfigReader.getProperty("expected_agent_failure_message"),
                ConfigReader.getProperty("error_message"));
    }



}
