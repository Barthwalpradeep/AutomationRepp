package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
  static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By Indsty = By.id("Form_submitForm_Industry");
		By Cntry = By.id("Form_submitForm_Country");
		
//		Select select = new Select(getelement(Indsty));//default construtor is undefined for select class so we have to pass webelement
//		select.selectByIndex(3);
		doselectbyindex(Cntry,4);
		

	}
	public static WebElement getelement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doselectbyvisibletext(By locator , String text) {
		Select select = new Select(getelement(locator));
		select.selectByVisibleText(text);
	}
	
	public static void doselectbyindex(By locator , int index) {
		Select select = new Select(getelement(locator));
		select.selectByIndex(index);
	}
	public static void doselectbyvalue(By locator , String value) {
		Select select = new Select(getelement(locator));
		select.selectByValue(value);;
	}
	
	

}
