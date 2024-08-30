package io.paysky.qa.utilities.sharedComponent;

import io.paysky.qa.pages.*;

import io.paysky.qa.utilities.DataFaker;

public class SharedComponent extends AbstractClass {
    final OnboardingPage onboardingPage = new OnboardingPage();
    final LoginPage loginPage = new LoginPage();
    final PinCodePage pinCodePage = new PinCodePage();

    public void  loginToMainMenu(String mobileNum , String pin1,String pin2,String pin3,String pin4,String pin5,String pin6 ) throws Exception {
        onboardingPage.clickOnSkipButton();
        loginPage.enterMobileNumberOnLoginScreen(mobileNum);
        loginPage.clickOnNextButton();
        pinCodePage.enterLoginPinDigit1(pin1);
        pinCodePage.enterLoginPinDigit1(pin2);
        pinCodePage.enterLoginPinDigit1(pin3);
        pinCodePage.enterLoginPinDigit1(pin4);
        pinCodePage.enterLoginPinDigit1(pin5);
        pinCodePage.enterLoginPinDigit1(pin6);
        pinCodePage.clickOnLoginButton();
    }
}
