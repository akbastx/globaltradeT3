package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.US09Page;
import utilities.Driver;

public class US09StepDefinitions {
    US09Page us09Page = new US09Page();

    @Then("Click Shirt option")
    public void click_Shirt_option() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(us09Page.shirtsOption).click().perform();
    }

    @Then("Click Casual Shirts")
    public void click_Casual_Shirts() {
        us09Page.casualShirtsOption.click();
    }

    @Then("See if there is no item")
    public void see_if_there_is_no_item() {
        String actualMessageText = us09Page.messageText.getText();
        Assert.assertEquals("Record Not Found..",actualMessageText);
    }

}
