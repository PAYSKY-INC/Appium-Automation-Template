package io.paysky.qa.pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class LoginPage extends AbstractClass {

    private final By mobileNumberTextField = AppiumBy.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]");
    private final By nextButton = AppiumBy.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button");

    public void enterMobileNumberOnLoginScreen(String mobileNumber) throws Exception {

       typeText(mobileNumberTextField,mobileNumber,15);
    }
    public void clickOnNextButton() throws Exception {
        clickOnElement(nextButton,25);
    }
}
