package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignUpPage {

    public SignUpPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id = "mobile")
    public WebElement phoneNumber;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "re_password")
    public WebElement re_password;

    @FindBy(name = "submit")
    public WebElement submitButton;

    @FindBy(xpath = "//div/form/div[1]/strong")
    public WebElement successMessage;






}
