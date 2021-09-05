package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementWait {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		// Timer.smallWait();

		By emailId = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");
		By navigationlins = By.cssSelector("aside#column-right a");

		WebElement ele = waitforElementvisible(10, emailId);
		getelementTextList(10,navigationlins);

//		ele.sendKeys("test@gmail.com");
//		driver.findElement(password).sendKeys("test123");
		//driver.findElement(loginBtn).click();
//		List <WebElement> elelist = waitforElementstovisible(10 ,navigationlins);
//		for(WebElement e : elelist) {
//			System.out.println(e.getText());
//		}

	}
	public static WebElement getelement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;

	}
	//********when element is ready to click**********************
	public static void clickwhenready(By Locator ,int timeout) {
		waitforelementtoclickable( Locator , timeout).click();	
		
	}
	public static WebElement waitforelementtoclickable(By Locator ,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.elementToBeClickable(Locator));
	}
//***************End**************************
	public static WebElement waitforElementpresent(int timeout, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public static WebElement waitforElementvisible(int timeout, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static WebElement visibilityUsinWebElement(int timeout, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.visibilityOf(getelement(locator)));
	}
	public static List<WebElement> waitforElementstovisible(int timeout, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	public static List<String> getelementTextList(int timeout, By locator) {
		List<WebElement> elelist = waitforElementstovisible(timeout,locator);
		List<String> eleTextlist = new ArrayList<String>();
		for(WebElement e : elelist) {
			eleTextlist.add(e.getText());
		}
		return eleTextlist;
		
	}

}
