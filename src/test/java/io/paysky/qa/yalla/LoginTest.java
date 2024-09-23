package io.paysky.qa.yalla;
import io.paysky.qa.pages.*;
import io.paysky.qa.utilities.sharedComponent.SharedComponent;
import io.paysky.qa.utilities.testdata.Constant;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest {
    final OnboardingPage onboardingPage = new OnboardingPage();
    final LoginPage loginPage = new LoginPage();
    final PinCodePage pinCodePage = new PinCodePage();
    final HomePage homePage = new HomePage();
    final RejectedLoginPage rejectedLoginPage = new RejectedLoginPage();
    String yallaMerchantExpectedText = "Yalla Merchant App";
    String rejectedNumberExpectedText = "Account Rejected";

    public LoginTest() throws Exception {
    }

    @Test(priority = 1)
    public void validLoginWithMobileNumber() throws Exception {
        onboardingPage.clickOnSkipButton();
        loginPage.enterMobileNumberOnLoginScreen(Constant.EG_MOBILE_NUMBER);
        loginPage.clickOnNextButton();
        pinCodePage.enterPin(Constant.DEFAULT_PIN);  // Pass the PIN array dynamically
        pinCodePage.clickOnLoginButton();
        Assert.assertEquals(homePage.getMerchantYallaAppLogoText(), yallaMerchantExpectedText,
                "Verify the Yalla Merchant App text is displayed correctly.");
    }

    @Test(priority = 1)
    public void LoginWithRejectedMobileNumber() throws Exception {
        onboardingPage.clickOnSkipButton();
        loginPage.enterMobileNumberOnLoginScreen(Constant.REJECTED_MOBILE_NUMBER);
        loginPage.clickOnNextButton();
        Assert.assertEquals(rejectedLoginPage.getMRejectedText(), rejectedNumberExpectedText,
                "Verify the Yalla Merchant App text is displayed correctly.");

    }
}
