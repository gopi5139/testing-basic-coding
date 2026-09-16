package coding.selenium_programs;

import org.openqa.selenium.WebDriver;

public class SwitchBetweenFrames {
    public static void switchToFrame(WebDriver driver, int index) {
        driver.switchTo().frame(index);
    }
}
