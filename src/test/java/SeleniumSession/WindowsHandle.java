package SeleniumSession;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		Set <String> handleId = driver.getWindowHandles();
		List<String> windolist = new ArrayList<String>(handleId);
		driver.findElement(By.xpath("//img[@alt = 'LinkedIn OrangeHRM group']")).click();
		driver.switchTo().window(windolist.get(1));
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
	

	}

}
