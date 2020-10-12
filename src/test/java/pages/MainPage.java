package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPage {

    public MainPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//span[@class='icon_with_fon'])[4]")
    public WebElement cellPhoneTab;

    @FindBy(partialLinkText = "Mobile Phones")
    public WebElement mobilePhone;






}
