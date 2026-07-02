package selenium;


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
	WebDriver driver = new ChromeDriver();
	
	public ContextClick() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}
	public void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "c://java/chromerdriver.exe");
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.get("http://www.google.co.in");
		
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.contextClick().build().perform();
		//driver.(Keys.CONTROL+"P", Keys.ENTER).build().perform();
		a.keyDown(Keys.CONTROL).sendKeys(Keys.chord("P")).perform();
		
		
		
		By element = By.xpath("//");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File d = new File("E://screenshot.png");
		FileUtils.copyFile(ss, d);
	}

}
