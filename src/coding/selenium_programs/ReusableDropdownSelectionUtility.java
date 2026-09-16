package coding.selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ReusableDropdownSelectionUtility {
    public static void selectByVisibleText(WebDriver driver, By locator, String value) {
        Select dropdown = new Select(driver.findElement(locator));
        dropdown.selectByVisibleText(value);
    }
}
