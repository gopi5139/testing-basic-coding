package coding.selenium_programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserLaunchTest extends SeleniumBaseTest {

    @Test
    public void shouldLaunchBrowserAndOpenGoogle() {
        driver.get("https://www.google.com");
        Assert.assertTrue(driver.getCurrentUrl().contains("google"));
    }
}
