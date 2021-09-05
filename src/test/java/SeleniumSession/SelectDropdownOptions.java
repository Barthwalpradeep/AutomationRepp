package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownOptions {
static WebDriver driver ;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By Indsty = By.id("Form_submitForm_Industry");
		By Cntry = By.id("Form_submitForm_Country");
		
//		WebElement Industry = driver.findElement(Indsty);
//		WebElement Country = driver.findElement(Cntry);
//		
//		Select select = new Select(Industry);
//		 List <WebElement> induslist = select.getOptions();
//		 System.out.println(induslist.size());
//		 
//		 for(WebElement e:induslist) {
//			 System.out.println(e.getText());
//		 }
		
//		List <String> Induslist = getdropdownoptionList(Indsty);
//		if(Induslist.size() == 21) {
//			System.out.println("Pass");
//		}
//		if(Induslist.contains("Healthcare")) {
//			System.out.println("Pass");
//		}
		selectDropDownvalue(Indsty,"Healthcare");

	}
	
	public static WebElement getelement(By Locator) {
		return driver.findElement(Locator);
		
	}
	
	public static List<String> getdropdownoptionList(By Locator) {
		List<String> optionValue = new ArrayList<String>();//created blank list ad add optionvalue in ths
		Select select = new Select(getelement(Locator));
		 List <WebElement> optionlist = select.getOptions();
		 System.out.println(optionlist.size());
		 
		 for(WebElement e:optionlist) {
			 System.out.println(e.getText());
			 optionValue.add(e.getText());
			 
		 }
		 return optionValue;
		
		
	}
	public static void selectDropDownvalue(By Locator, String Value) {
		List<String> optionValue = new ArrayList<String>();//created blank list ad add optionvalue in ths
		Select select = new Select(getelement(Locator));
		 List <WebElement> optionlist = select.getOptions();
		 System.out.println(optionlist.size());
		 
		 for(WebElement e:optionlist) {
			 String text = (e.getText());
			 if(text.equals(Value)) {
				 e.click();
				 break;
				 
			 }
			 
		 }
		 //return optionValue;
		
		
	}

}
