package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US15CellComPage {
    public US15CellComPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//span[@class='icon_widh'])[4]")
    public WebElement cellphoneAndCommunicationsMenu;
    @FindBy(linkText = "Wallet Cases")
    public WebElement wallet;
    @FindBy(xpath = "(//h3)[1]")
    public WebElement product;
    @FindBy(xpath = "(//h4)[6]")
    public WebElement designFilter;
    @FindBy (xpath = "//input[@value='Vintage']")
    public WebElement vintageCheckBox;
    @FindBy (xpath = "//input[@value='Sports']")
    public WebElement sportsCheckBox;
    @FindBy (xpath = "//input[@value='Jewelled']")
    public WebElement jewelledCheckBox;
    @FindBy (xpath = "//input[@value='Exotic']")
    public WebElement exoticCheckBox;
    @FindBy (xpath = "//input[@value='Geometric']")
    public WebElement geometricCheckBox;
    @FindBy (xpath = "//input[@value='Business']")
    public WebElement businessCheckBox;
    @FindBy(xpath = "(//button[@class='btn btn-sm btn-warning btn-block'])[4]")
    public WebElement designFilterButton;
    @FindBy(xpath = "//div[@class='col-sm-6 col-md-12 col-xs-12 alert alert-danger ']")
    public WebElement businessProduct;

    //fgdflgjdf;
}
