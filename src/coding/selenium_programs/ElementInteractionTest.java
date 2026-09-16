package coding.selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElementInteractionTest extends SeleniumBaseTest {

    @Test
    public void shouldTypeInSearchBox() {
        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Java Selenium");
        Assert.assertEquals(searchBox.getAttribute("value"), "Java Selenium");
    }
}
