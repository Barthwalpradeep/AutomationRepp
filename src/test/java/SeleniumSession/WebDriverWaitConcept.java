package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitConcept {
	static  WebDriver driver;
	public static void main(String[] args) {		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		By link = By.linkText("Register");
		driver.findElement(link).click();
		
		//WebElement ele = waitforelementpresence(email ,10);
		WebDriverWait wait = new WebDriverWait(driver,10);
		if (wait.until(ExpectedConditions.urlContains("register"))) {
			System.out.println(driver.getCurrentUrl());
		}
	}
	
	public static WebElement waitforelementpresence(By locator ,int timeout ) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));		
	}

}
