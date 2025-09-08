package pages;

import base.DemoAppBasePage;
import io.appium.java_client.AppiumDriver;
import utils.DemoAppXpathUtils;
import org.openqa.selenium.By;

public class DemoAppNavigationPage extends DemoAppBasePage {

    public DemoAppNavigationPage(AppiumDriver driver) {
        super(driver);
    }

    public void clickHamburgerMenu() {
        if (isDisplayed(By.xpath(DemoAppXpathUtils.GLOBAL_HAMBURGER))) {
            click(By.xpath(DemoAppXpathUtils.GLOBAL_HAMBURGER));
        }
    }

    public void redirectToLoginMenu() {
        if (isDisplayed(By.xpath(DemoAppXpathUtils.LOGIN_MENU))) {
            click(By.xpath(DemoAppXpathUtils.LOGIN_MENU));
        }
    }

    public void redirectToAboutMenu() {
        if (isDisplayed(By.xpath(DemoAppXpathUtils.ABOUT_MENU))) {
            click(By.xpath(DemoAppXpathUtils.ABOUT_MENU));
        }
    }

    public void redirectToApiCallsPage() {
        if (isDisplayed(By.xpath(DemoAppXpathUtils.API_CALL_MENU))) {
            click(By.xpath(DemoAppXpathUtils.API_CALL_MENU));
        }
    }

    public void redirectToLogout() {
        if (isDisplayed(By.xpath(DemoAppXpathUtils.LOGOUT_MENU))) {
            click(By.xpath(DemoAppXpathUtils.LOGOUT_MENU));
        }
    }

    public void redirectToSauceVideoPage() {
        if (isDisplayed(By.xpath(DemoAppXpathUtils.SAUCE_VIDEO_MENU))) {
            click(By.xpath(DemoAppXpathUtils.SAUCE_VIDEO_MENU));
        }
    }

    public void redirectToDrawingPage() {
        if (isDisplayed(By.xpath(DemoAppXpathUtils.DRAWING_MENU))) {
            click(By.xpath(DemoAppXpathUtils.DRAWING_MENU));
        }
    }

    public void redirectToGeoLocationPage() {
        if (isDisplayed(By.xpath(DemoAppXpathUtils.GEO_LOCATION_MENU))) {
            click(By.xpath(DemoAppXpathUtils.GEO_LOCATION_MENU));
        }
    }
}
