package coding.selenium_programs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility {
    public static void captureScreenshot(WebDriver driver, String filePath) throws IOException {
        Path destination = Path.of(filePath);
        Files.createDirectories(destination.getParent());
        Files.copy(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE).toPath(), destination, StandardCopyOption.REPLACE_EXISTING);
    }
}
