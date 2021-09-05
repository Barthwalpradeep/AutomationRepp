package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com");
		driver.findElement(By.name("username")).sendKeys("groupautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value = 'Login']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		selectcontact("Aasthta Grover");
		//parent to child...>
		   //dorect child..>/
		  // indirect child..>//
		 //child to parent
		    //backward travering....both below eample issame
		//inpit[@id = '']/../../../../..
		//input[@id = '']//parent::div---->Immediate parent
		//>>>>Ancestor keyword
		//input[@id = '']//ancestor::div---->all pgrand paretn
		
		
		//Sibling traversing
		//a[@text() = '"+name+"']//parent::td//preceding-sibling::td/input[@type = 'checkbox']
		

	}
	public static void selectcontact(String name) {
		String xpath = "//a[text() = '"+name+"']//parent::td//preceding-sibling::td/input[@type = 'checkbox']";
		driver.findElement(By.xpath(xpath));
		}
	public static String companyname(String name) {
		String cmapcnypath = "//a[text() = '\"+name+\"']//parent::td//following-sibling::td/a[@context= 'company']";
		String Companyname = driver.findElement(By.xpath(cmapcnypath)).getText();
		return Companyname;
	}

}
