package io.paysky.qa.pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

import java.util.List;

public class RegisterationPage2 extends AbstractClass {

    private final By businessTextField = AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[1]");
    private final By searchForLocation = AppiumBy.xpath("//android.view.View[@content-desc=\"Locate Business Location\"]");
    private final By locationOnMap = AppiumBy.xpath("//android.widget.EditText");
    private final By setLocationButton = AppiumBy.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.Button");
    private final By buisnessCategory = AppiumBy.xpath("//android.view.View[@content-desc=\"Choose business category\"]");
    private final By selectFromBuisnessCategory = AppiumBy.xpath("//android.widget.TextView[@text=\"Veterinary Services\"]");
    private final By selectOnConfirmButton = AppiumBy.xpath("//android.widget.Button");
    private final By termsCondition = AppiumBy.xpath("//android.widget.ScrollView/android.widget.CheckBox[1]");
    private final By termsConditions = AppiumBy.xpath("//android.widget.ScrollView/android.widget.CheckBox[2]");
    private final By nextButtonForRegistration = AppiumBy.xpath("//android.widget.ScrollView/android.view.View[4]/android.widget.Button");
    private final By signuitureTextBox = AppiumBy.xpath("//android.view.ViewGroup/android.view.View");
    private final By NextButtonToCompleteRegister = AppiumBy.xpath("//android.widget.ScrollView/android.view.View[4]/android.widget.Button");

    //upload
    private final By uploadButton = AppiumBy.xpath("//android.widget.ScrollView/android.view.View[3]/android.widget.Button");
    private final By nationalIDFrontButton = AppiumBy.xpath("//android.widget.TextView[@text=\"National ID Front*\"]");
    private final By uploadImageButton = AppiumBy.xpath("(//android.view.View[@content-desc=\"Icon\"])[2]");
    private final By imageSelection = AppiumBy.xpath("//android.widget.ImageView[@resource-id=\"com.google.android.documentsui:id/icon_thumb\"]");
    private final By confirmUploadButton = AppiumBy.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button");
    private final By nationalIDBackButton = AppiumBy.xpath("//android.widget.TextView[@text=\"National ID Back*\"]");
    private final By commercialRegisterButton = AppiumBy.xpath("//android.widget.TextView[@text=\"Commercial Registration*\"]");
    private final By TaxRegistrationButton = AppiumBy.xpath("//android.widget.TextView[@text=\"Tax Registration*\"]");
    private final By contractButton = AppiumBy.xpath("//android.widget.TextView[@text=\"Contract*\"]");



    public void enterbusinessNameOnRegisterScreen(String business) throws Exception {
       typeText(businessTextField,business,15);
    }
    public void clickOnSearchForLocation() throws Exception {
        clickOnElement(searchForLocation,25);
    }

    public void enterlocationOnMap(String location) throws Exception {
        typeText(locationOnMap,location,40);
        clickOnElement(setLocationButton,40);
    }
    public void clickOnBusnessCateButton() throws Exception {
        clickOnElement(buisnessCategory,25);
        clickOnElement(selectFromBuisnessCategory,25);
    }

    public void selectBusinesCate() throws Exception {
        clickOnElement(selectOnConfirmButton,25);
    }

    public void clickOntuploadButton() throws Exception {
        clickOnElement(uploadButton,25);
    }

    public void uploadDocuments(List<String> documentTypes) throws Exception {
        for (String documentType : documentTypes) {
            clickOnElement(getUploadButton(documentType), 25);
            clickOnElement(uploadImageButton, 25);
            clickOnElement(imageSelection, 25);
        }
    }

    private By getUploadButton(String documentType) {
        switch (documentType) {
            case "National ID Front":
                return nationalIDFrontButton;
            case "National ID Back":
                return nationalIDBackButton;
            case "Commercial Registration":
                return commercialRegisterButton;
            case "Tax Registration":
                return TaxRegistrationButton;
            case "Contract":
                return contractButton;
            default:
                throw new IllegalArgumentException("Invalid document type: " + documentType);
        }
    }

    public void clickOnConfirmUploadButton() throws Exception {
        clickOnElement(confirmUploadButton,25);
    }

    public void clickOnTermsAndConditionCheckBox() throws Exception {
        clickOnElement(termsCondition,25);
        clickOnElement(termsConditions,25);
    }
    public void clickOnNextButton() throws Exception {
        clickOnElement(nextButtonForRegistration,25);
    }

    public void clickOnSignuitureBox() throws Exception {
        clickOnElement(signuitureTextBox,25);

    }
    public void clickOnNextButtontoFinishRegister() throws Exception {
        clickOnElement(NextButtonToCompleteRegister,25);

    }
    public void scroll(String text) throws Exception {
        scrollToTextAndroid(text,25);
    }
}
