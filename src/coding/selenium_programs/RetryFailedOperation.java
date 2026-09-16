package coding.selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.StaleElementReferenceException;

public class RetryFailedOperation {
    public static void clickWithRetry(WebDriver driver, By locator, int maxRetries) {
        int attempts = 0;
        while (attempts < maxRetries) {
            try {
                driver.findElement(locator).click();
                return;
            } catch (StaleElementReferenceException e) {
                attempts++;
                if (attempts == maxRetries) {
                    throw e;
                }
            }
        }
    }
}
