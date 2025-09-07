package pages;

import org.openqa.selenium.By;

import base.DemoAppBasePage;
import io.appium.java_client.AppiumDriver;
import utils.PropertiesReader;

public class DemoAppLoginPage extends DemoAppBasePage{
	
	private DemoAppNavigationPage navigation;

	
	private static final String USERNAME_FIELD = PropertiesReader.get("LoginPageXpaths.usernameField");
	private static final String PASSWORD_FIELD = PropertiesReader.get("LoginPageXpaths.passwordField");
	private static final String LOGIN_BUTTON   = PropertiesReader.get("LoginPageXpaths.loginButton");

	
	public DemoAppLoginPage(AppiumDriver driver) {
		super(driver);
        this.navigation = new DemoAppNavigationPage(driver); // composition
	}

	public void redirectToLoginModule() {
		this.navigation.clickHamburgerMenu();
		this.navigation.redirectToLoginMenu();
	}
	
	public void loginCredentials() {
	    this.type(By.xpath(USERNAME_FIELD), "alice@example.com");
	    this.type(By.xpath(PASSWORD_FIELD), "10203040");
	    this.click(By.xpath(LOGIN_BUTTON));
	}

	
}
