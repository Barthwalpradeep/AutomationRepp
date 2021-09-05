package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CRMproFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com");
		driver.findElement(By.name("username")).sendKeys("groupautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value = 'Login']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("mainpanel");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("CONTACTS"))).perform();;
		Thread.sleep(2000);
		driver.findElement(By.linkText("New Contact")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("first_name")).sendKeys("PRADEEP");

	}

}
