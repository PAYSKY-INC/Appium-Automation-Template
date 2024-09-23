package io.paysky.qa.pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class RejectedLoginPage extends AbstractClass {

    private final By acountRejectedText = AppiumBy.xpath("//android.widget.TextView[@text=\"Account Rejected\"]");

    public String getMRejectedText() throws Exception {
        return getTextFromElement(acountRejectedText, 10); // Adjust duration as needed
    }
}
