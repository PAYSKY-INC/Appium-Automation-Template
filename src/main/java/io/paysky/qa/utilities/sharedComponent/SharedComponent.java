package io.paysky.qa.utilities.sharedComponent;

import io.paysky.qa.pages.*;
import io.paysky.qa.utilities.testdata.Constant;

public class SharedComponent extends AbstractClass {
    final OnboardingPage onboardingPage = new OnboardingPage();
    final LoginPage loginPage = new LoginPage();
    final PinCodePage pinCodePage = new PinCodePage();

    public void loginToMainMenu(String mobileNum, String[] pin) throws Exception {
        // Use default values if none are provided
        if (mobileNum == null) {
            mobileNum = Constant.EG_MOBILE_NUMBER;
        }
        if (pin == null) {
            pin = Constant.DEFAULT_PIN;
        }
        onboardingPage.clickOnSkipButton();
        loginPage.enterMobileNumberOnLoginScreen(mobileNum);
        loginPage.clickOnNextButton();
        pinCodePage.enterPin(pin);
        pinCodePage.clickOnLoginButton();
    }
    public void loginToMainMenu() throws Exception {
        loginToMainMenu(null, null);  // Calls the main method with default values
    }
}
