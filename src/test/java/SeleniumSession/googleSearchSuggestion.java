package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearchSuggestion {
	 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("Naveen Automation Labs");
		Thread.sleep(2000);
		
		//List<WebElement> Sugglist = driver.findElements(By.xpath("//ul[@role = 'listbox']//div[@class = 'wM6W7d']/span"));
		List<WebElement> Sugglist1 = driver.findElements(By.cssSelector(".wM6W7d"));
		
      for(WebElement e :Sugglist1) {
    	  String text = e.getText();
    	  System.out.println(text);
    	  if(text.equalsIgnoreCase("naveen automation labs")) {
    		  e.click();
    		  break;
    	  }
      }
	}

}
