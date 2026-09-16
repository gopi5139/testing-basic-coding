package coding.selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReusableTextEntryMethod {
    public static void enterText(WebDriver driver, By locator, String value) {
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(value);
    }
}
