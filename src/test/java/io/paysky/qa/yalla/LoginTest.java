package io.paysky.qa.yalla;


import io.paysky.qa.pages.PinCodePage;
import io.paysky.qa.utilities.sharedComponent.SharedComponent;
import io.paysky.qa.utilities.testdata.Constant;
import io.paysky.qa.pages.OnboardingPage;
import io.paysky.qa.pages.LoginPage;
import io.paysky.qa.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest {
    final OnboardingPage onboardingPage = new OnboardingPage();
    final LoginPage loginPage = new LoginPage();
    final PinCodePage pinCodePage = new PinCodePage();
    final HomePage homePage = new HomePage();
    String actualText = homePage.getMerchantYallaAppLogoText();
    String expectedText = "Yalla Merchant App";
    final SharedComponent sharedComponent = new SharedComponent();
    public LoginTest() throws Exception {
    }

    @Test(priority = 1)
    public void ValidLoginWithMobileNumber() throws Exception {

        onboardingPage.clickOnSkipButton();
        loginPage.enterMobileNumberOnLoginScreen(Constant.EG_MOBILE_NUMBER);
        loginPage.clickOnNextButton();
        pinCodePage.enterLoginPinDigit1(Constant.PIN_NUMBER_1);
        pinCodePage.enterLoginPinDigit2(Constant.PIN_NUMBER_2);
        pinCodePage.enterLoginPinDigit3(Constant.PIN_NUMBER_3);
        pinCodePage.enterLoginPinDigit4(Constant.PIN_NUMBER_4);
        pinCodePage.enterLoginPinDigit5(Constant.PIN_NUMBER_5);
        pinCodePage.enterLoginPinDigit6(Constant.PIN_NUMBER_6);
        pinCodePage.clickOnLoginButton();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test(priority = 1)
    public void ValidLoginWithegy() throws Exception {

       sharedComponent.loginToMainMenu(Constant.EG_MOBILE_NUMBER,Constant.PIN_NUMBER_1,Constant.PIN_NUMBER_2,Constant.PIN_NUMBER_3,Constant.PIN_NUMBER_4,Constant.PIN_NUMBER_5,Constant.PIN_NUMBER_6);
    }


}
