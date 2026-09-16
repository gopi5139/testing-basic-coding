package coding.selenium_programs;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
//import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClick {
    @FindBy(xpath = "//")
    private List<WebElement> locator;
    private WebDriver driver;

    public ContextClick() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        PageFactory.initElements(driver, this);
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        ContextClick contextClick = new ContextClick();
        try {
            contextClick.driver.manage().window().maximize();
            contextClick.driver.get("http://www.google.co.in");

            Thread.sleep(2000);
            Actions a = new Actions(contextClick.driver);
            a.contextClick().build().perform();
            a.keyDown(Keys.CONTROL).sendKeys(Keys.chord("P")).perform();

            By element = By.xpath("//");
            WebDriverWait wait = new WebDriverWait(contextClick.driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));

            File ss = ((TakesScreenshot) contextClick.driver).getScreenshotAs(OutputType.FILE);
            File d = new File("/tmp/screenshot.png");
            FileUtils.copyFile(ss, d);
        } finally {
            if (contextClick.driver != null) {
                contextClick.driver.quit();
            }
        }
    }
}
