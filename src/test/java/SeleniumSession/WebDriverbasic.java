package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverbasic {

	public static void main(String[] args) {
		//Ist start the server with system server command
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		//topcasting::child class object can be referred y parent interface reference variable
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");//always use https when passing the url it wont run if https is not passed in url
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		driver.quit();

	}

}
