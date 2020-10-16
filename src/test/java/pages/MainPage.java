package pages;

import net.bytebuddy.implementation.bind.annotation.FieldValue;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class MainPage {

    public MainPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//span[@class='icon_with_fon'])[4]")
    public WebElement cellPhoneTab;

    @FindBy(partialLinkText = "Mobile Phones")
    public WebElement mobilePhone;


    @FindBy(linkText = "Seller Sign in")
    public WebElement sellerSignin;

    @FindBy(id = "username")
    public WebElement usernamebox;

    @FindBy(id="password")
    public WebElement passwordbox;

    @FindBy(id="submit")
    public WebElement logInButton;


    @FindBy(xpath ="(//span[@class='icon_with_fon'])[3]")
    public WebElement jewelryAccessories;


    @FindBy(linkText ="Earrings")
    public WebElement earrings;
    @FindBy(linkText = "Wedding & Engagement Jewelry")
    public WebElement wedding;
    @FindBy(linkText = "Fine Jewelry" )
    public WebElement fineJewelry;
    @FindBy(linkText = "Beads & Jewelry Making")
    public WebElement beadsJewelry;
    @FindBy(linkText = "Necklaces & Pendants")
    public WebElement necklacesPendants;
    @FindBy(linkText = "Rings")
    public WebElement rings;
    @FindBy(linkText = "Bracelets & Bangles")
    public WebElement braceletsBangles;
    @FindBy(linkText = "Jewelry Sets & More")
    public WebElement jewelrySetsMore;

    @FindBy(linkText = "Sign In")
    public WebElement signIn;
    @FindBy(id = "email")
    public WebElement email;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(xpath = "//button[@value='Login']")
    public WebElement login;
    @FindBy(id="typeahead")
    public WebElement searchbox;
    @FindBy(xpath = "//i[@class='fa fa-search']")
    public WebElement searchLogo;
    @FindBy(xpath = "//img[@class='lazy img-responsive']")
    public WebElement appleIpad;
    @FindBy(xpath = "//a[@class='btn btn-default'][4]")
    public WebElement gb256;
    @FindBy(xpath = "//a[@class='btn btn-default'][3]")
    public WebElement gb128;
    @FindBy(xpath = "//a[@class='btn btn-default'][2]")
    public WebElement gb64;
    @FindBy(xpath = "//a[@class='btn btn-default'][1]")
    public WebElement gb32;
    @FindBy(xpath = "//h4[@class='pro_new_head']")
    public WebElement infoText;
    //








}
