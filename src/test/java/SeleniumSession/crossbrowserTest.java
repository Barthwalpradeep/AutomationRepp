package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class crossbrowserTest {
	static WebDriver driver;

	public static void main(String[] args) {
		String browser = "chrome";
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")){
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Please pass the correct driver");
		}
		
		driver.get("https://www.google.com");//always use https when passing the url it wont run if https is not passed in url
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		

	}

}
