package coding.selenium_programs;

import org.openqa.selenium.WebDriver;

public class SwitchBetweenBrowserWindows {
    public static void switchToWindow(WebDriver driver, String windowHandle) {
        driver.switchTo().window(windowHandle);
    }
}
