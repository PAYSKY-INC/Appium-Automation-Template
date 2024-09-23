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
    final SharedComponent sharedComponent = new SharedComponent();
    String expectedText = "Yalla Merchant App";

    public LoginTest() throws Exception {
    }

    @Test(priority = 1)
    public void validLoginWithMobileNumber() throws Exception {
        onboardingPage.clickOnSkipButton();
        loginPage.enterMobileNumberOnLoginScreen(Constant.EG_MOBILE_NUMBER);
        loginPage.clickOnNextButton();
        pinCodePage.enterPin(Constant.DEFAULT_PIN);  // Pass the PIN array dynamically
        pinCodePage.clickOnLoginButton();
       // Assert.assertEquals(homePage.getMerchantYallaAppLogoText(), expectedText,
         //       "Verify the Yalla Merchant App text is displayed correctly.");
        Thread.sleep(5000);
        homePage.clickOnBillsIcond();
    }

    @Test(priority = 1)
    public void validLoginWithMobileNumbers() throws Exception {
        sharedComponent.loginToMainMenu();
    }
}
