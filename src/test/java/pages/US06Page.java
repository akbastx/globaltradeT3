package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US06Page {
    public US06Page(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (xpath = "(//span[@class='icon_widh'])[1]")
    public WebElement menClotAccess;

    @FindBy (xpath = "//a[text()='T-Shirts']")
    public WebElement tshirtButton;

    @FindBy (xpath = "(//div[@class='checkbox'])[14]")
    public WebElement unisexText;

    @FindBy (xpath = "(//div[@class='checkbox'])[15]")
    public WebElement maleText;

    @FindBy (xpath = "(//div[@class='checkbox'])[16]")
    public WebElement femaleText;

    @FindBy (xpath = "(//div[@class='checkbox'])[17]")
    public WebElement childerenText;

    @FindBy (xpath = "//input[@value='Unisex']")
    public WebElement unisexBox;

    @FindBy (xpath = "//input[@value='Male']")
    public WebElement maleBox;

    @FindBy (xpath = "//input[@value='Female']")
    public WebElement femaleBox;

    @FindBy (xpath = "//input[@value='Children']")
    public WebElement childerenBox;

    @FindBy (xpath = "(//button[@name='filter_submit'])[3]")
    public WebElement filterButton;
}
