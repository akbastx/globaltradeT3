package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.SignUpPage;
import utilities.ConfigReader;
import utilities.Driver;

public class GLB9_Akbas_StepDefinitions {

    SignUpPage signUpPage = new SignUpPage();

    @Given("user is on the sign up page")
    public void user_is_on_the_sign_up_page() {
        Driver.getDriver().get(ConfigReader.getProperty("signUp_url"));
    }

    @Given("user enters the email {string}")
    public void user_enters_the_email(String string) {
        signUpPage.email.sendKeys((string));
    }

    @Given("user enters the name {string}")
    public void user_enters_the_name(String string) {
        signUpPage.name.sendKeys((string));
    }

    @Given("user enters the phone {string}")
    public void user_enters_the_phone(String string) {
        signUpPage.phoneNumber.sendKeys((string));
    }

    @Given("user enters the password {string}")
    public void user_enters_the_password(String string) {
        signUpPage.password.sendKeys((string));
    }

    @Given("user enters the re-password {string}")
    public void user_enters_the_re_password(String string) {
        signUpPage.re_password.sendKeys((string));
    }

    @Given("user submits the form")
    public void user_submits_the_form() {
        signUpPage.submitButton.click();
    }

    @Then("verify the success message is visible")
    public void verify_the_success_message_is_visible() {




            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 2);
       Assert.assertTrue(!wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h3)[1]"))).isDisplayed());

       // WebDriverWait wait = new WebDriverWait(Driver.getDriver(),2);
      //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(("(//h3)[1]"))));



    }


}
