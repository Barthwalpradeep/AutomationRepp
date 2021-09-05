package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttributeConcept {
    static WebDriver driver;
	
    public static void main(String[] args) {
		// Rule: Webelement + get attribute(attribute name)--->String
    	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.get("https://demo.opencart.com/index.php?route=account/register");
    	By login = By.linkText("Login");
//    	String text = driver.findElement(login).getAttribute("href");
//    	System.out.println(text);
    	String texxt = getattribute(login , "href");
    	System.out.println(texxt);
    	
    	//getattribute(By.name("search"),"placeholder");   is also correct but not good practice
    	
    	

	}
    
    public static WebElement getelement(By locator) {
    	return driver.findElement(locator);
    }
    public static String getattribute(By locator , String attrname) {
    	return driver.findElement(locator).getAttribute(attrname);
    	
    }
    

}
