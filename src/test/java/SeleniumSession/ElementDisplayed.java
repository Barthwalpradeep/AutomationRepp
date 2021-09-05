package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplayed {

	static WebDriver driver;

	public static void main(String[] args) {

		// rule--> weblelement + isdisplayed();---->boolean

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		ElementUtil Eu = new ElementUtil(driver);

//       boolean flag =  driver.findElement(By.name("search")).isDisplayed();
//       System.out.println(flag);

		By elementname = (By.name("search"));// element name is variable which stores the locator
		By path = (By.xpath("//*[@id=\"search\"]/span/button"));
		if (iselementdisplayed(elementname)) {
			Eu.input(elementname, "Automation");
			Eu.doclick(path);
		}

	}

	public static WebElement getelement(By locator) {
		return driver.findElement(locator);
	}

	public static boolean iselementdisplayed(By locator) {
		return getelement(locator).isDisplayed();
	}
	
	public static boolean iselementenabled(By locator) {
		return getelement(locator).isEnabled();
	}

}
