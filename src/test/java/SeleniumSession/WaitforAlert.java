package SeleniumSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitforAlert {
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		String text = getalerttext(10);
//		System.out.println(text);
		//alert.accept();
		String title  = WaitforTitleContains("Login",10);
		System.out.println(title);

	}
	
     public static String WaitforTitleContains(String titlevalue ,int timeout) {
    	 WebDriverWait wait = new WebDriverWait(driver ,timeout );
    	 if(wait.until(ExpectedConditions.titleContains(titlevalue))){
    		 return driver.getTitle();
    		  	 }
    	 return null;
    	 
     }
     
     public static String WaitforTitleIs(String fulltitle ,int timeout) {
    	 WebDriverWait wait = new WebDriverWait(driver ,timeout );
    	 if(wait.until(ExpectedConditions.titleIs(fulltitle))){
    		 return driver.getTitle();
    		  	 }
    	 return null;
    	 
     }
     
	public static Alert waitforalert(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.alertIsPresent());

	}

	public static String getalerttext(int timeout) {
		String text =  waitforalert(timeout).getText();
		acceptalert(timeout);
		return text;
		
	}

	public static void acceptalert(int timeout) {
		waitforalert(timeout).accept();
	}

	public static void sendkeysalert(int timeout, String value) {
		waitforalert(timeout).sendKeys(value);
	}
	
	public static String waitforcontainsURL(String urlfraction ,int timeout) {
   	 WebDriverWait wait = new WebDriverWait(driver ,timeout );
   	 if(wait.until(ExpectedConditions.urlContains(urlfraction))){
   		 return driver.getCurrentUrl();
   		  	 }
   	 return null;
   	 
    }
	public static String waitforfullURL(String urlvalue ,int timeout) {
	   	 WebDriverWait wait = new WebDriverWait(driver ,timeout );
	   	 if(wait.until(ExpectedConditions.urlToBe(urlvalue))){
	   		 return driver.getCurrentUrl();
	   		  	 }
	   	 return null;
	   	 
	    }

}
