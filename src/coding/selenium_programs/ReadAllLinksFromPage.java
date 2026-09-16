package coding.selenium_programs;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReadAllLinksFromPage {
    public static void printAllLinks(WebDriver driver) {
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (WebElement link : links) {
            System.out.println(link.getAttribute("href"));
        }
    }
}
