package coding.selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReusableClickMethod {
    public static void clickElement(WebDriver driver, By locator) {
        driver.findElement(locator).click();
    }
}
