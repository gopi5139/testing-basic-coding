package coding.selenium_programs;

import coding.framework.BaseTest;
import java.util.logging.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SeleniumBaseTest extends BaseTest {
    private static final Logger LOGGER = Logger.getLogger(SeleniumBaseTest.class.getName());

    @BeforeMethod(alwaysRun = true)
    public void setupDriver() {
        LOGGER.info("Executing TestNG before method and starting Chrome browser.");
        setup("chrome");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDownDriver() {
        LOGGER.info("Executing TestNG after method and closing browser session.");
        tearDown();
    }
}
