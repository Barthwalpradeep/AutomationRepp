package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropdownwithoutSelect {
 static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By Industry = (By.xpath("//select[@id='Form_submitForm_Industry']/option"));
		clickdropdownvalue(Industry,"Healthcare" );
		
//		List <WebElement> induslist = driver.findElements(Industry);
//		
//		for(WebElement e : induslist) {
//			String text = e.getText();
//			if(text.equals("Education")) {
//				e.click();
//				break;
//			}
//		}
		
		
	}
	public static void clickdropdownvalue(By locator ,String value) {
     List <WebElement> dropdownlist = driver.findElements(locator);
		System.out.println(dropdownlist.size());
		for(WebElement e : dropdownlist) {
			String text = e.getText();
			if(text.equals(value)) {
				System.out.println("Pass");
				e.click();
				break;
			}
		}
		
	}

}
