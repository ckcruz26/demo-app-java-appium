package base;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class DemoAppBasePage {
    protected AppiumDriver driver;

    public DemoAppBasePage(AppiumDriver driver) {
        this.driver = driver;
    }

    protected void click(By locator) {
        driver.findElement(locator).click();
    }

    protected void type(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }

    protected String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    protected boolean isDisplayed(By locator) {
        return driver.findElement(locator).isDisplayed();
    }
}
