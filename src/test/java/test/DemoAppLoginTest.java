package test;

import base.DemoAppBaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DemoAppLoginPage;

public class DemoAppLoginTest extends DemoAppBaseTest {

    private DemoAppLoginPage loginPage;

    @BeforeMethod
    public void goToLogin() {
        // initialize page object
        loginPage = new DemoAppLoginPage(driver);
        loginPage.redirectToLoginModule();
    }

    @Test
    public void validCredentials() {
        loginPage.loginCredentials("bob@example.com", "10203040");
        loginPage.logoutSession();
    }
    
    @Test
    public void invalidCredentials() {
    	loginPage.loginCredentials("bob@example.com", "zxczcx");
    }
    
   
}
