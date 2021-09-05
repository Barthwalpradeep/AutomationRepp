package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framehandles {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		
		//driver.switchTo().frame(2);
		//driver.switchTo().frame("main");
		List<WebElement> frameconnt = driver.findElements(By.name("main"));
		driver.switchTo().frame(driver.findElement(By.name("main")));
		String titletxt = driver.findElement(By.xpath("/html/body/h2")).getText();//will display org.openqa.selenium.NoSuchElementException: as there frame involved
		System.out.println(titletxt);
		//return to default frame
		driver.switchTo().defaultContent();

	}

}
