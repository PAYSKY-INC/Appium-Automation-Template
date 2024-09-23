package io.paysky.qa.pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class HomePage extends AbstractClass {
    private final By yallaMerchantAppLogo = AppiumBy.xpath("//android.widget.TextView[@text=\"Yalla Merchant App\"]");

    private final By billsIcond = AppiumBy.xpath("//androidx.compose.ui.platform.ComposeView//android.view.View[./following-sibling::android.view.View[@text='Bills']]");

    public String getMerchantYallaAppLogoText() throws Exception {
        return getTextFromElement(yallaMerchantAppLogo, 10); // Adjust duration as needed
    }

    public void clickOnBillsIcond() throws Exception {
        clickOnElement(billsIcond,40);
    }


}
