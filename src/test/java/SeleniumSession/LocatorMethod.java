package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorMethod {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		/*
		 * driver.findElement(By.id("Form_submitForm_FirstName")).sendKeys("Pradeep");
		 * driver.findElement(By.id("Form_submitForm_LastName")).sendKeys("Barthwal");
		 * driver.findElement(By.id("Form_submitForm_Email")).sendKeys("pb@gmail.com");
		 * driver.findElement(By.id("Form_submitForm_JobTitle")).sendKeys("Test Analyst"
		 * );
		 * driver.findElement(By.id("Form_submitForm_CompanyName")).sendKeys("Capgemini"
		 * );
		 * driver.findElement(By.id("Form_submitForm_Contact")).sendKeys("9176072067");
		 */

		// @nd Approach
		/*
		 * WebElement firstName =
		 * driver.findElement(By.id("Form_submitForm_FirstName")); WebElement Lastname =
		 * driver.findElement(By.id("Form_submitForm_LastName"));
		 * firstName.sendKeys("Pradeep"); Lastname.sendKeys("Barthwal");
		 */

		// 3rd approach;;Bylocator
		/*
		 * By firstName = (By.id("Form_submitForm_FirstName")); //cretaed by locators By
		 * LastName = (By.id("Form_submitForm_LastName")); WebElement FN =
		 * driver.findElement(firstName);//Web element created WebElement LN =
		 * driver.findElement(LastName);
		 * 
		 * FN.sendKeys("Pradeep"); LN.sendKeys("Barthwal");
		 */

		// 4th approach;;...generic method:::we create a genric method and return
		// webelement
		/*
		 * By firstName = (By.id("Form_submitForm_FirstName")); //cretaed by locators By
		 * LastName = (By.id("Form_submitForm_LastName"));
		 * 
		 * getelement(firstName).sendKeys("Pradeep");
		 * getelement(LastName).sendKeys("Barthwal");
		 */

		// 5th Approach................
		/*
		 * By firstName = (By.id("Form_submitForm_FirstName")); 
		 * //cretaed by locators By
		 * LastName = (By.id("Form_submitForm_LastName")); 
		 * input(firstName, "Madan"); input(LastName, "Mohan");
		 */

		// 6th approach Create a new elementutil class with generic function
		/*
		 * By firstName = (By.id("Form_submitForm_FirstName")); 
		 * //cretaed by locators By
		 * LastName = (By.id("Form_submitForm_LastName")); 
		 * ElementUtil Eu = new ElementUtil(driver); 
		 * Eu.input(firstName, "Madan"); Eu.input(LastName,
		 * "Barthwal");
		 */
		///////////////////////////////////////////////////////////////
		
		ElementUtil Eu = new ElementUtil(driver);
		
		////////////////////////////////////////////////////////////////
		//Another Locator:ByName
//		  By Link = By.linkText("Login");
//		  ElementUtil Eu = new ElementUtil(driver); 
//		  Eu.doclick(Link);
		  
		 //////////////////////////////////////////
//		  By agree = By.name("agree");
//		  Eu.doclick(agree);
		
		//////////////////////////////////////////////
		//partial link text
//		By forgot = By.partialLinkText("Forgotten");
//		Eu.doclick(forgot);
		
		////////////////////////////
		//by xpath::is address of element insid the dom
//		By namepath = By.xpath("//*[@id=\"input-firstname\"]");
//		Eu.input(namepath, "Pradeep");
		
		/////////////////////////////////////////
		//css selector:: is a locator not an attribute
//		By css = By.cssSelector("#input-firstname");
//		Eu.input(css, "Automation");
		
		//////////////////////////////////////////////
		//tagName
		By Taggg = By.tagName("h1");
		String text = Eu.gettext(Taggg);
		System.out.println(text);

		// driver.quit();

	}

}
