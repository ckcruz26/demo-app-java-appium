package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.*;
import java.net.URL;

public class DemoAppBaseTest {
	
    protected AppiumDriver driver;
	
    @BeforeClass
    public void setUp() throws Exception {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setDeviceName("Android Device");
        options.setUdid("491f9254"); // change to your device
        options.setPlatformVersion("15");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.saucelabs.mydemoapp.rn");
        options.setAppActivity("com.saucelabs.mydemoapp.rn.MainActivity");

        // assign directly to the class-level driver
        driver = new AndroidDriver(
                new URL("http://127.0.0.1:4723"), options
        );
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
