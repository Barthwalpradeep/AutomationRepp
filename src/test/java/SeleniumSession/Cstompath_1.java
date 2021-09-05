package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cstompath_1 {
    static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
        String path = "//input[@id = 'input-email']";
        String name = "Login";
        //By email = getlocator("xpath" , path);
       // getelement(email).sendKeys("naveenautomaton");
        
        //...............Indexing in path................
        // (//input[@class = 'form-control'])[1];
       
        // (//input[@class = 'form-control'])[position() = 1];>>>>Position concept inbuilt function in xpath
       
        //>>>last element path
        //(//input[@class = '']//a)[last()]
        
        //>>>>text function
        ////a[text() = 'Login']
        
        
        //>>>Contains function>>>>
        //htmltag[contains(@attribute,'value')]
        //input[contains(@id,'email')]
        
       // >>Contains text
        //input[contains(text(),''])
        
        //>>>>>>
        //input[contains(@id = 'emil) and @text = '' and contains(@name = '')]'
        
        //contains with text and attributes
        //input[contains(@id, '') and contains(@name,'')]
        
        //starts with
        //input[starts-with(text(),'')]
        //input[starts-with(@name,'')]
        
        
        getelement("xpath" , path).sendKeys("Pradeep Practice");
        getelement("linkText", name).click();
	}
	
	public static By getlocator(String locatortype,String locatorvalue) {
		By locator = null;
		switch(locatortype) {
		case "id":
			locator = By.id(locatorvalue);
			break;			
		case "name":
			locator = By.name(locatorvalue);
			break;			
		case "xpath":
			locator = By.xpath(locatorvalue);
			break;
			
		case "linkText":
			locator = By.linkText(locatorvalue);
			break;
		default:
			break;
				
		}
		return locator;		
	}
	public static WebElement getelement(By locator ) {
		return driver.findElement(locator);
	}
	//method overloading
	
	public static WebElement getelement(String locatortype,String locatorvalue) {
		return driver.findElement(getlocator( locatortype, locatorvalue));
	}

}
