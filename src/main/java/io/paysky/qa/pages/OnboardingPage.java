package io.paysky.qa.pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class OnboardingPage extends AbstractClass {

    private final By skipButton = AppiumBy.xpath("//android.widget.TextView[@text=\"Skip\"]");

    public void clickOnSkipButton() throws Exception {
        clickOnElement(skipButton,20);
    }
}
