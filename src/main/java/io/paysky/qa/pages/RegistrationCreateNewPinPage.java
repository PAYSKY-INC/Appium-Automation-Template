package io.paysky.qa.pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class RegistrationCreateNewPinPage extends AbstractClass {

    private final By[] newRegisterPinDigitLocators = {
            AppiumBy.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"),
            AppiumBy.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"),
            AppiumBy.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]"),
            AppiumBy.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[4]"),
            AppiumBy.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[5]"),
            AppiumBy.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[6]"),
    };
    private final By pinConfirmButton = AppiumBy.xpath("//android.widget.TextView[@text=\"Confirm PIN\"]");
    private final By registartionOkButton = AppiumBy.xpath("//android.widget.Button");
    private final By successMessageNewPIN = AppiumBy.xpath("//android.widget.TextView[@text=\"Success!\n" +
            "Your new PIN code has been set\"]");
    private final By skipAfterRegistartion = AppiumBy.xpath("//android.widget.TextView[@text=\"Skip\"]");
    private final By popupArea = AppiumBy.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]");



    public void enterNewRegisterPin(String[] pin) throws Exception {
        if (pin.length != newRegisterPinDigitLocators.length) {
            throw new IllegalArgumentException("PIN length does not match the number of input fields.");
        }
        for (int i = 0; i < pin.length; i++) {
            typeText(newRegisterPinDigitLocators[i], pin[i], 15);
        }
    }
    public void clickOnConfirmButton() throws Exception {
        clickOnElement(pinConfirmButton, 25);
    }

    public void clickonOKButtonToProceed() throws Exception {
        clickOnElement(popupArea,25);
        clickOnElement(registartionOkButton, 25);    }

    public void clickonskipButtonAfterRegistartion() throws Exception {
        clickOnElement(skipAfterRegistartion, 25);
    }

    public String getSucessRegestrationText() throws Exception {
        clickOnElement(popupArea,25);
        return getTextFromElement(successMessageNewPIN, 10); // Adjust duration as needed
    }
}