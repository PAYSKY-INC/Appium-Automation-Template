package io.paysky.qa.pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class PinCodePage extends AbstractClass {

    private final By[] pinDigitLocators = {
            AppiumBy.xpath("//android.widget.ScrollView/android.view.View/android.view.View[2]/android.widget.EditText"),
            AppiumBy.xpath("//android.widget.ScrollView/android.view.View/android.view.View[3]/android.widget.EditText"),
            AppiumBy.xpath("//android.widget.ScrollView/android.view.View/android.view.View[4]/android.widget.EditText"),
            AppiumBy.xpath("//android.widget.ScrollView/android.view.View/android.view.View[5]/android.widget.EditText"),
            AppiumBy.xpath("//android.widget.ScrollView/android.view.View/android.view.View[6]/android.widget.EditText"),
            AppiumBy.xpath("//android.widget.ScrollView/android.view.View/android.view.View[7]/android.widget.EditText")
    };

    private final By loginButton = AppiumBy.xpath("//android.widget.ScrollView/android.view.View/android.view.View[8]/android.widget.Button");

    public void enterPin(String[] pin) throws Exception {
        if (pin.length != pinDigitLocators.length) {
            throw new IllegalArgumentException("PIN length does not match the number of input fields.");
        }
        for (int i = 0; i < pin.length; i++) {
            typeText(pinDigitLocators[i], pin[i], 15);
        }
    }
    public void clickOnLoginButton() throws Exception {
        clickOnElement(loginButton, 25);
    }
}