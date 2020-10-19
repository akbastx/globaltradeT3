package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ConsumerElecPage {

    public ConsumerElecPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//span[@class='icon_widh'])[6]")
    public WebElement consumerElecLink;

    @FindBy(xpath = "//a[@title='Accessories & Parts']")
    public WebElement accessoriesPart;

    @FindBy(xpath = "//a[@title='Camera & Photo']")
    public WebElement cameraPhoto;

    @FindBy(xpath = "//a[@title='Smart Electronics']")
    public WebElement smartElectronic;

    @FindBy(xpath = "//a[@title='Home Audio & Video']")
    public WebElement homeAudioVideo;

    @FindBy(xpath = "//a[@title='Portable Audio & Video']")
    public WebElement portableAuVideo;

    @FindBy(xpath = "//a[@title='Video Games']")
    public WebElement videoGame;

    @FindBy(linkText = "Camera & Photo Accessories")
    public WebElement cameraPhotoSub;

    @FindBy(linkText = "Digital Cables")
    public WebElement digitalCablesSub;

    @FindBy(linkText = "Digital Gear Bags")
    public WebElement digitalGearBagSub;

    @FindBy(linkText = "Digital Cameras")
    public WebElement digitalCameraSub;

    @FindBy(linkText = "Digital Voice Recorder")
    public WebElement digitalVoiceRecoderSub;

    @FindBy(linkText = "Handheld Game Players")
    public WebElement handGamePlyrSub;

    @FindBy(linkText = "Projectors & Accessories")
    public WebElement projectorsAccessoriesSub;

    @FindBy(linkText = "Smart Watches")
    public WebElement smartWatchesSub;





}
