package io.paysky.qa.pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class HomePage extends AbstractClass {
    private final By yallaMerchantAppLogo = AppiumBy.xpath("//android.widget.TextView[@text=\"Yalla Merchant App\"]");

    public String getMerchantYallaAppLogoText() throws Exception {
        return getTextFromElement(yallaMerchantAppLogo, 10); // Adjust duration as needed
    }


}
