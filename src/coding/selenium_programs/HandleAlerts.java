package coding.selenium_programs;

import org.openqa.selenium.WebDriver;

public class HandleAlerts {
    public static void acceptAlert(WebDriver driver) {
        driver.switchTo().alert().accept();
    }

    public static void dismissAlert(WebDriver driver) {
        driver.switchTo().alert().dismiss();
    }
}
