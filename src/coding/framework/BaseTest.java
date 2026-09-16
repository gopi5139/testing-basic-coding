package coding.framework;

import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;

public abstract class BaseTest {
    private static final Logger LOGGER = Logger.getLogger(BaseTest.class.getName());
    protected WebDriver driver;

    public void setup(String browserName) {
        LOGGER.info("Starting Selenium setup for browser: " + browserName);
        driver = BrowserFactory.createDriver(browserName);
        DriverManager.setDriver(driver);
        LOGGER.info("WebDriver setup completed successfully.");
    }

    public void tearDown() {
        LOGGER.info("Closing Selenium WebDriver session.");
        DriverManager.quitDriver();
        LOGGER.info("WebDriver closed successfully.");
    }
}
