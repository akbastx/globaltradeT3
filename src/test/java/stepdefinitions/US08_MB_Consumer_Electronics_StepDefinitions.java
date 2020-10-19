package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.ConsumerElecPage;
import utilities.Driver;

public class US08_MB_Consumer_Electronics_StepDefinitions {

    ConsumerElecPage consumerElecPage = new ConsumerElecPage();

    public void backAndClick(){
        Driver.getDriver().navigate().back();
        consumerElecPage.consumerElecLink.click();

    }

    @When("click on Consumer Electronics")
    public void click_on_Consumer_Electronics() {
        consumerElecPage.consumerElecLink.click();

    }

    @When("hoveroverConsumer Electronics")
    public void hoveroverconsumer_Electronics() {

    }

    @When("click on Accessories&Parts")
    public void click_on_Accessories_Parts() {
        consumerElecPage.accessoriesPart.click();

    }

    @Then("verify Accessories&Parts option is displayed")
    public void verify_Accessories_Parts_option_is_displayed() {
       consumerElecPage.accessoriesPart.isDisplayed();
    }

    @Then("click on camera&photo")
    public void click_on_camera_photo() {
       backAndClick();
        consumerElecPage.cameraPhoto.click();

    }

    @Then("verify camera&photo option is displayed")
    public void verify_camera_photo_option_is_displayed() {
        consumerElecPage.cameraPhoto.isDisplayed();

    }

    @Then("click on Smart electronics")
    public void click_on_Smart_electronics() {
        backAndClick();
        consumerElecPage.smartElectronic.click();

    }

    @Then("verify  Smart electronics option is displayed")
    public void verify_Smart_electronics_option_is_displayed() {
       consumerElecPage.smartElectronic.isDisplayed();
    }

    @Then("click on home audio&video")
    public void click_on_home_audio_video() {
        backAndClick();
        consumerElecPage.homeAudioVideo.click();

    }

    @Then("verify home audio&video option is displayed")
    public void verify_home_audio_video_option_is_displayed() {
      consumerElecPage.homeAudioVideo.isDisplayed();
    }

    @Then("click on  portable audio&video")
    public void click_on_portable_audio_video() {
        backAndClick();
        consumerElecPage.portableAuVideo.click();

    }

    @Then("verify  portable audio&video option is displayed")
    public void verify_portable_audio_video_option_is_displayed() {
       consumerElecPage.portableAuVideo.isDisplayed();
    }

    @Then("click on video games")
    public void click_on_video_games() {
        backAndClick();
        consumerElecPage.videoGame.click();

    }

    @When("verify video games option is displayed")
    public void verify_video_games_option_is_displayed() {
      consumerElecPage.videoGame.isDisplayed();
    }

    @When("click on Camera & Photo Accessories")
    public void click_on_Camera_Photo_Accessories() {
      //  backAndClick();
        consumerElecPage.cameraPhotoSub.click();

    }

    @Then("verify Camera & Photo Accessories option is displayed")
    public void verify_Camera_Photo_Accessories_option_is_displayed() {
     //  consumerElecPage.cameraPhotoSub.isDisplayed();
        String expectedTitle = "Camera & Photo Accessories";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

    }

    @Then("click on Digital Cables")
    public void click_on_Digital_Cables() {
        backAndClick();
        consumerElecPage.digitalCablesSub.click();

    }

    @Then("verify Digital Cables option is displayed")
    public void verify_Digital_Cables_option_is_displayed() {
      //consumerElecPage.digitalCablesSub.isDisplayed();
        String expectedTitle ="Digital Cables";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Then("click on Digital Gear Bags")
    public void click_on_Digital_Gear_Bags() {
        backAndClick();
        consumerElecPage.digitalGearBagSub.click();

    }

    @Then("verify  Digital Gear Bags option is displayed")
    public void verify_Digital_Gear_Bags_option_is_displayed() {
      // consumerElecPage.digitalGearBagSub.isDisplayed();
        String expectedTitle = "Digital Gear Bags";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Then("click on Digital Cameras")
    public void click_on_Digital_Cameras() {
        backAndClick();
        consumerElecPage.digitalCameraSub.click();

    }

    @Then("verify Digital Cameras option is displayed")
    public void verify_Digital_Cameras_option_is_displayed() {
      //  consumerElecPage.digitalCameraSub.isDisplayed();
        String expectedTitle = "Digital Cameras";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Then("click on  Digital Voice Recorder")
    public void click_on_Digital_Voice_Recorder() {
        backAndClick();
        consumerElecPage.digitalVoiceRecoderSub.click();

    }

    @Then("verify  Digital Voice Recorder option is displayed")
    public void verify_Digital_Voice_Recorder_option_is_displayed() {
      // consumerElecPage.digitalVoiceRecoderSub.isDisplayed();
        String expectedTitle = "Digital Voice Recorder";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Then("click on Handheld Game Players")
    public void click_on_Handheld_Game_Players() {
        backAndClick();
        consumerElecPage.handGamePlyrSub.click();

    }

    @Then("verify Handheld Game Players option is displayed")
    public void verify_Handheld_Game_Players_option_is_displayed() {
     // consumerElecPage.handGamePlyrSub.isDisplayed();
        String expectedTitle = "Handheld Game Players";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Then("click on Projectors & Accessories")
    public void click_on_Projectors_Accessories() {
      backAndClick();
      consumerElecPage.projectorsAccessoriesSub.click();

    }

    @Then("verify Projectors & Accessories option is displayed")
    public void verify_Projectors_Accessories_option_is_displayed() {
    // consumerElecPage.projectorsAccessoriesSub.isDisplayed();
        String expectedTitle = "Projectors & Accessories";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Then("click on Smart Watches")
    public void click_on_Smart_Watches() {
        backAndClick();
        consumerElecPage.smartWatchesSub.click();


    }

    @Then("verify Smart Watches option is displayed")
    public void verify_Smart_Watches_option_is_displayed() {
      // consumerElecPage.smartWatchesSub.isDisplayed();
        String expectedTitle = "Smart Watches";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }


}
