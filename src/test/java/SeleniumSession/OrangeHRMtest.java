package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRMtest {

	public static void main(String[] args) {
		String browser = "chrome";
		Browserutil brutil = new Browserutil();
		WebDriver driver = brutil.launchbrowser(browser);
		brutil.launchurl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		brutil.getpagetitle();
		
		
		//maintain By locators...
		By firstName = (By.id("Form_submitForm_FirstName")); //cretaed by locators
		By LastName =  (By.id("Form_submitForm_LastName"));
		By Company = (By.id("Form_submitForm_CompanyName"));
		By email = (By.id("Form_submitForm_Email"));
		By Contact = (By.id("Form_submitForm_Contact"));
		By designation = (By.id("Form_submitForm_JobTitle"));
		
		
		
		ElementUtil Eutil = new ElementUtil(driver);
		Eutil.input(firstName, "madan");
		Eutil.input(LastName, "Mohan");
		Eutil.input(designation, "TestAnalyst");
		Eutil.input(email, "pb@gmail.com");
		Eutil.input(Contact, "9176072067");
		Eutil.input(Company, "Capgemini");
		
	//	brutil.closebrowser();
		
		

	}

}

