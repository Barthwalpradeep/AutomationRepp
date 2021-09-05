package SeleniumSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSpopuphandle {
	 static WebDriver driver ;
	public static void main(String[] args) {
		// js--Alert----
		//WebDriver driver ;
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		By Elename = By.name("proceed");
		getElement(Elename).click();
		//ALert is displaying as java script pop up/also callled as java scrpt pop up and we can do  three function  get text ,accept,dismiss and send keys
		
		//switch our driver to alert and then perform the actions
		Alert alert = driver.switchTo().alert();
		alert.getText();
		alert.accept();
		//alert.sendKeys("Testing");
		//return to the main content
		driver.switchTo().defaultContent();

	}
	
	public static WebElement getElement(By Locator) {
		
		return driver.findElement(Locator);
		
	}

}
