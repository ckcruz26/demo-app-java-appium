package pages;

import org.openqa.selenium.By;

import base.DemoAppBasePage;
import io.appium.java_client.AppiumDriver;
import utils.DemoAppXpathUtils;


public class DemoAppLoginPage extends DemoAppBasePage{
	
	private DemoAppNavigationPage navigation;
	
	public DemoAppLoginPage(AppiumDriver driver) {
		super(driver);
        this.navigation = new DemoAppNavigationPage(driver); // composition
	}

	public void redirectToLoginModule() {
		this.navigation.clickHamburgerMenu();
		this.navigation.redirectToLoginMenu();
	}
	
	public void loginCredentials(String email, String password) {
	    this.type(By.xpath(DemoAppXpathUtils.USERNAME_FIELD), email);
	    this.type(By.xpath(DemoAppXpathUtils.PASSWORD_FIELD), password);
	    this.click(By.xpath(DemoAppXpathUtils.LOGIN_BUTTON));
	}	
	
	public void logoutSession() {
		this.navigation.clickHamburgerMenu();
		this.navigation.redirectToLogout();
		this.isDisplayed(By.xpath(DemoAppXpathUtils.LOGOUT_BUTTON));
		this.click(By.xpath(DemoAppXpathUtils.LOGOUT_BUTTON));
	}

	
}
