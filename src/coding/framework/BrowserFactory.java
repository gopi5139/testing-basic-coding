package coding.framework;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.Locale;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserFactory {
    private static final Logger LOGGER = Logger.getLogger(BrowserFactory.class.getName());

    public static WebDriver createDriver(String browserName) {
        String browser = browserName.toLowerCase(Locale.ROOT);
        LOGGER.info("Requested browser: " + browserName);

        if (browser.equals("chrome")) {
            LOGGER.info("Configuring Google Chrome in normal (non-headless) mode.");
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--start-maximized");
            chromeOptions.addArguments("--disable-notifications");
            chromeOptions.addArguments("--disable-dev-shm-usage");
            chromeOptions.addArguments("--no-sandbox");
            chromeOptions.addArguments("--disable-gpu");
            return new ChromeDriver(chromeOptions);
        } else if (browser.equals("firefox")) {
            LOGGER.info("Configuring Firefox in normal (non-headless) mode.");
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.addArguments("--start-maximized");
            firefoxOptions.addArguments("--width=1920");
            firefoxOptions.addArguments("--height=1080");
            return new FirefoxDriver(firefoxOptions);
        }

        String message = "Unsupported browser: " + browserName;
        LOGGER.severe(message);
        throw new IllegalArgumentException(message);
    }
}
