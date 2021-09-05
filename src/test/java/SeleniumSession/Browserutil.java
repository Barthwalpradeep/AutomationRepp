package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserutil {
	public WebDriver driver;

	public WebDriver launchbrowser(String browser) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("Please pass the correct driver");
		}
		return driver;

	}

	@SuppressWarnings("unused")
	public void launchurl(String url) {
		if (url == null) {
			return;
		}
		if (url.isEmpty()) {
			return;
		}
		driver.get(url);
	}

	public String getpagetitle() {
		// String title = driver.getTitle();
		return driver.getTitle();
	}

	public void closebrowser() {
		driver.quit();
	}

}
