package coding.selenium_programs;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindBrokenLinksFromWebpage {
    public static void printBrokenLinks(WebDriver driver) throws IOException {
        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement link : links) {
            String href = link.getAttribute("href");
            if (href == null || href.isBlank()) {
                continue;
            }
            URL url = new URL(href);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("HEAD");
            int statusCode = connection.getResponseCode();
            if (statusCode >= 400) {
                System.out.println("Broken link: " + href + " -> status " + statusCode);
            }
        }
    }
}
