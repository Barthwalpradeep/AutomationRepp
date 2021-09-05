package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassEception {
  static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		WebElement choice = driver.findElement(By.id("justAnInputBox"));
		
		Select select = new Select(choice);
		select.selectByIndex(2);//-->UnexpectedTagNameException: Element should have been "select" but was "input"
		

	}

}
