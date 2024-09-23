package io.paysky.qa.yalla;

import io.paysky.qa.pages.*;
import io.paysky.qa.utilities.DataFaker;
import io.paysky.qa.utilities.sharedComponent.SharedComponent;
import io.paysky.qa.utilities.testdata.Constant;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;


public class RegisterTest {
    @BeforeMethod
    public void setUp() throws Exception {
        sharedComponent.registerUsingNewNumber();
    }

    final SharedComponent sharedComponent = new SharedComponent();
    final DataFaker dataFaker = new DataFaker();
    final RegisterationPage registerationPage = new RegisterationPage();
    final RegisterationPage2 registerationPage2 = new RegisterationPage2();
    final RegistrationCreateNewPinPage registrationCreateNewPinPage = new RegistrationCreateNewPinPage();
    String expectedText = "Success!\nYour new PIN code has been set";

    public RegisterTest() throws Exception {
    }

    @Test(priority = 1)
    public void validRegisterWithMobileNumber() throws Exception {
        registerationPage.enterFullNameOnRegisterScreen(dataFaker.fullName());
        registerationPage.clickOnDropDownlist();
        registerationPage.enterEmailOnRegisterScreen(dataFaker.generateEmail(dataFaker.fullName()));
        registerationPage.clickOnNextButton();
        registerationPage2.enterbusinessNameOnRegisterScreen(dataFaker.buisnessName());
        registerationPage2.clickOnSearchForLocation();
        registerationPage2.enterlocationOnMap(dataFaker.location());
        registerationPage2.clickOnBusnessCateButton();
        registerationPage2.selectBusinesCate();
        registerationPage2.clickOntuploadButton();
        registerationPage2.uploadDocuments(Arrays.asList("National ID Front", "National ID Back", "Commercial Registration", "Tax Registration", "Contract"));
        registerationPage2.clickOnConfirmUploadButton();
        registerationPage2.clickOnTermsAndConditionCheckBox();
        registerationPage2.clickOnNextButton();
        registerationPage2.clickOnSignuitureBox();
        registerationPage2.scroll("Next");
        registerationPage2.clickOnNextButtontoFinishRegister();
        registrationCreateNewPinPage.enterNewRegisterPin(Constant.DEFAULT_PIN);
        registrationCreateNewPinPage.clickOnConfirmButton();
        Assert.assertEquals(registrationCreateNewPinPage.getSucessRegestrationText(), expectedText,
                "Verify the sucess message displayed correctly.");
        registrationCreateNewPinPage.clickonOKButtonToProceed();
        registrationCreateNewPinPage.clickonskipButtonAfterRegistartion();
    }
}
