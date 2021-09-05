package SeleniumSession;

import org.openqa.selenium.WebDriver;

public class amazonTest {

	public static void main(String[] args) {
		Browserutil br = new Browserutil();
		WebDriver driver = br.launchbrowser("chrome");
		br.launchurl("https://www.amazon.com");
		String Title = br.getpagetitle();		
		if(Title.contains("Spend less")) {
			System.out.println(Title);	
		}
		else {
			System.out.println("Incorrect page opened");
		}
		br.closebrowser();

	}

}
