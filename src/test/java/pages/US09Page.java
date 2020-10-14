package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US09Page {
        public US09Page(){
            PageFactory.initElements(Driver.getDriver(),this);
        }

    @FindBy (xpath = "//h4//a[text()=' Shirts ']")
    public WebElement shirtsOption;

    @FindBy (xpath = "(//p[@class='cat_bg_top'])[1]")
    public WebElement casualShirtsOption;

    @FindBy (xpath = "//div[@class='col-sm-6 col-md-12 col-xs-12 alert alert-danger ']")
    public WebElement messageText;
}
