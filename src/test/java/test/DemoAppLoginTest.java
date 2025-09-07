package test;

import base.DemoAppBaseTest;
import org.testng.annotations.Test;
import pages.DemoAppLoginPage;

public class DemoAppLoginTest extends DemoAppBaseTest {

    @Test
    public void testLogin() {
        // Initialize the page object using the inherited driver
        DemoAppLoginPage loginPage = new DemoAppLoginPage(driver);

        // Navigate to login module
        loginPage.redirectToLoginModule();

        // Enter login credentials
        loginPage.loginCredentials();

        // TODO: add assertion to verify login success
        // Example:
        // Assert.assertTrue(loginPage.isLoginSuccessful());
    }
}
