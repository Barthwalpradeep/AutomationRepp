package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitforframe {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mainpanel"));
		driver.findElement(By.linkText("CONTACS"));

	}

	public static void waitforframeandSwitch(String framename, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(framename));
	}

	public static void waitforframeandSwitch(By framelocator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(framelocator));
	}

	public static void waitforframeandSwitch(int frameindex, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameindex));
	}

	public static void waitforframeandSwitch(WebElement element, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
	}

	public static void waitforframeandSwitch(By framelocator, int timeout, int intervaltime) {
		WebDriverWait wait = new WebDriverWait(driver, timeout, intervaltime);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(framelocator));
	}
}
