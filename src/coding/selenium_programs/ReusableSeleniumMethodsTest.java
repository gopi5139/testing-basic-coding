package coding.selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReusableSeleniumMethodsTest extends SeleniumBaseTest {

    @Test
    public void shouldOpenGoogleHomePage() {
        driver.get("https://www.google.com");
        Assert.assertTrue(driver.getTitle().contains("Google"));
    }

    @Test
    public void shouldUseReusableElementMethods() {
        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium Java");
        Assert.assertEquals(searchBox.getAttribute("value"), "Selenium Java");
    }
}
