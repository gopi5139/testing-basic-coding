package coding.selenium_programs;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationAndWaitTest extends SeleniumBaseTest {

    @Test
    public void shouldWaitForElementAndNavigate() {
        driver.get("https://www.google.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
        searchBox.sendKeys("Automation Testing");
        Assert.assertTrue(searchBox.isDisplayed());
    }
}
