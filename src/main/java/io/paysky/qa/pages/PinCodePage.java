package io.paysky.qa.pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class PinCodePage extends AbstractClass {

    private final By loginPinDigit1 = AppiumBy.xpath("//android.widget.ScrollView/android.view.View/android.view.View[2]/android.widget.EditText");
    private final By loginPinDigit2 = AppiumBy.xpath("//android.widget.ScrollView/android.view.View/android.view.View[3]/android.widget.EditText");
    private final By loginPinDigit3 = AppiumBy.xpath("//android.widget.ScrollView/android.view.View/android.view.View[4]/android.widget.EditText");
    private final By loginPinDigit4 = AppiumBy.xpath("//android.widget.ScrollView/android.view.View/android.view.View[5]/android.widget.EditText");
    private final By loginPinDigit5 = AppiumBy.xpath("//android.widget.ScrollView/android.view.View/android.view.View[6]/android.widget.EditText");
    private final By loginPinDigit6 = AppiumBy.xpath("//android.widget.ScrollView/android.view.View/android.view.View[7]/android.widget.EditText");
    private final By loginButton = AppiumBy.xpath("//android.widget.ScrollView/android.view.View/android.view.View[8]/android.widget.Button");


    public void enterLoginPinDigit1(String pinDigit1) throws Exception {

       typeText(loginPinDigit1,pinDigit1,15);
    }
    public void enterLoginPinDigit2(String pinDigit2) throws Exception {

        typeText(loginPinDigit2,pinDigit2,15);
    }
    public void enterLoginPinDigit3(String pinDigit3) throws Exception {

        typeText(loginPinDigit3,pinDigit3,15);
    }
    public void enterLoginPinDigit4(String pinDigit4) throws Exception {

        typeText(loginPinDigit4,pinDigit4,15);
    }
    public void enterLoginPinDigit5(String pinDigit5) throws Exception {

        typeText(loginPinDigit5,pinDigit5,15);
    }
    public void enterLoginPinDigit6(String pinDigit6) throws Exception {

        typeText(loginPinDigit6,pinDigit6,15);
    }
    public void clickOnLoginButton() throws Exception {
        clickOnElement(loginButton,25);
    }
}
