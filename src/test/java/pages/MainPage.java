package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPage {

    public MainPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@id=\"vertical\"]/div/div[2]/ul/li[4]/a/span[2]")
    public WebElement cellPhoneTab;

    @FindBy(xpath = "//*[@id=\"first-menu\"]/li/div/div/div/div[1]/div/div[1]/div/ul/li[2]/a")
    public WebElement mobilePhone;




}
