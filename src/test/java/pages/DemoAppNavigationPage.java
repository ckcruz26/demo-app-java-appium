package pages;

import base.DemoAppBasePage;
import io.appium.java_client.AppiumDriver;
import utils.PropertiesReader;

import org.openqa.selenium.By;

public class DemoAppNavigationPage extends DemoAppBasePage {

    private final By globalHamburger = By.xpath(PropertiesReader.get("BasePageXpaths.globalHamburger"));
    private final By loginMenu = By.xpath(PropertiesReader.get("BasePageXpaths.loginMenu"));
//    private final By aboutMenu = By.xpath(System.getProperty("BasePageXpaths.aboutMenu"));
//    private final By apiCallMenu = By.xpath(System.getProperty("BasePageXpaths.apiCallMenu"));
//    private final By logoutMenu = By.xpath(System.getProperty("BasePageXpaths.logoutMenu"));
//    private final By sauceVideoMenu = By.xpath(System.getProperty("BasePageXpaths.sauceVideoMenu"));
//    private final By drawingMenu = By.xpath(System.getProperty("BasePageXpaths.drawingMenu"));
//    private final By geoLocationMenu = By.xpath(System.getProperty("BasePageXpaths.geoLocationMenu"));

    public DemoAppNavigationPage(AppiumDriver driver) {
        super(driver);
    }

    public void clickHamburgerMenu() {
        click(globalHamburger);
    }

    public void redirectToLoginMenu() {
        click(loginMenu);
    }

//    public void redirectToAboutMenu() {
//        click(aboutMenu);
//    }
//
//    public void redirectToApiCallsPage() {
//        click(apiCallMenu);
//    }
//
//    public void redirectToLogout() {
//        click(logoutMenu);
//    }
//
//    public void redirectToSauceVideoPage() {
//        click(sauceVideoMenu);
//    }
//
//    public void redirectToDrawingPage() {
//        click(drawingMenu);
//    }
//
//    public void redirectToGeoLocationPage() {
//        click(geoLocationMenu);
//    }
}
