package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import java.net.URL;

public class DemoAppBaseTest {
	
	protected AppiumDriver driver;
	
    @BeforeClass
    public void setUp() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:deviceName", "Android Device");
        caps.setCapability("appium:udid", "491f9254"); // change to your device
        caps.setCapability("appium:platformVersion", "15");
        caps.setCapability("appium:automationName", "UiAutomator2");
        caps.setCapability("appium:appPackage", "com.saucelabs.mydemoapp.rn");
        caps.setCapability("appium:appActivity", "com.saucelabs.mydemoapp.rn.MainActivity");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
	
}
