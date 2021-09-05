package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthpopUphandle {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		String username = "admin";
		String pwd = "admin";
		driver.get("https://"+username + ":"+pwd +"@"+"the-internet.herokuapp.com/basic_auth");

	}

}
