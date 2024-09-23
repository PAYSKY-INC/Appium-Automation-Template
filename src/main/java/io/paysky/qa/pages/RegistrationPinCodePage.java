package io.paysky.qa.pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class RegistrationPinCodePage extends AbstractClass {

    private final By[] RegisterPinDigitLocators = {
            AppiumBy.xpath("//android.widget.ScrollView/android.view.View/android.widget.EditText[1]"),
            AppiumBy.xpath("//android.widget.ScrollView/android.view.View/android.widget.EditText[2]"),
            AppiumBy.xpath("//android.widget.ScrollView/android.view.View/android.widget.EditText[3]"),
            AppiumBy.xpath("//android.widget.ScrollView/android.view.View/android.widget.EditText[4]"),
            AppiumBy.xpath("//android.widget.ScrollView/android.view.View/android.widget.EditText[5]"),
            AppiumBy.xpath("//android.widget.ScrollView/android.view.View/android.widget.EditText[6]")
    };
    private final By confirmButton = AppiumBy.xpath("//android.widget.ScrollView/android.view.View/android.view.View[1]/android.widget.Button");

    public void enterRegisterPin(String[] pin) throws Exception {
        if (pin.length != RegisterPinDigitLocators.length) {
            throw new IllegalArgumentException("PIN length does not match the number of input fields.");
        }
        for (int i = 0; i < pin.length; i++) {
            typeText(RegisterPinDigitLocators[i], pin[i], 15);
        }
    }
    public void clickOnConfirmButton() throws Exception {
        clickOnElement(confirmButton, 25);
    }
}