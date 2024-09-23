package io.paysky.qa.pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class RegisterationPage extends AbstractClass {

    private final By fullNameTextField = AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[1]");
    private final By cityDropDownlist = AppiumBy.xpath("//android.view.View[@content-desc=\"Spinner Arrow\"]");
    private final By cairoSelectionDropDownlist = AppiumBy.xpath("//android.widget.TextView[@text=\"Cairo\"]");
    private final By emailTextField = AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[4]");
    private final By registerNextButton = AppiumBy.xpath("//android.widget.Button");

    public void enterFullNameOnRegisterScreen(String fullName) throws Exception {
       typeText(fullNameTextField,fullName,15);
    }
    public void clickOnDropDownlist() throws Exception {
        clickOnElement(cityDropDownlist,25);
        clickOnElement(cairoSelectionDropDownlist,25);
    }
    public void enterEmailOnRegisterScreen(String email) throws Exception {
        typeText(emailTextField,email,15);
    }
    public void clickOnNextButton() throws Exception {
        clickOnElement(registerNextButton,25);
    }
}
