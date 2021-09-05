package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jqueryDropdown {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(2000);
		By CountChoice = By.cssSelector(".comboTreeItemTitle");
		// approach good for single value selection-->TC01
		// selectchoice(CountChoice ,"choice 2 2");

		// For multiple value sleection in one go-->TC02
		//selectchoice(CountChoice, "choice 2 2", "choice 2 3", "choice 4");

		// For All Selection-->TC_03
		selectchoice(CountChoice, "all");

//		List<WebElement> choicelist = driver.findElements(By.cssSelector(".comboTreeItemTitle"));
//		
//		for(WebElement e:choicelist ) {
//			String choicetext = e.getText();
//			if(choicetext.equals("choice 2 2") ) {
//				e.click();
//				break;
//				
//			}
//		}

	}

	public static List<WebElement> getelements(By locator) {
		List<WebElement> element = driver.findElements(locator);
		return element;

	}

	public static void selectchoice(By locator, String... value) // String... value is an array of value
	{
		List<WebElement> choicelist = getelements(locator);
		if (!value[0].equalsIgnoreCase("all")) {
			for (WebElement e : choicelist) {
				String choicetext = e.getText();

				for (int j = 0; j < value.length; j++)
					if (choicetext.equals(value[j])) {
						e.click();
						break;

					}
			}

		} else {
			try {//try catch has been used since application has hidden element and scriptis trying click it and getting elementnotinteractable Exception
			for (WebElement e : choicelist) {
				e.click();
			}
			}
			catch(Exception e) {}
		}
	}
}
