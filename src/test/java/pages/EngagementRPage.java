package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EngagementRPage {

    public EngagementRPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "(//span[@class='icon_widh'])[3]")
    public WebElement jewelryAccessories;

    @FindBy(xpath = "//a[@title='Wedding & Engagement Jewelry']")
    public WebElement weddingEngagement;

    @FindBy(xpath = "(//div[@class='border-img'])[2]")
    public WebElement engagementRing;

    @FindBy(xpath = "//div[text()=' Record Not Found.. ']")
    public WebElement verifyRing;


}
