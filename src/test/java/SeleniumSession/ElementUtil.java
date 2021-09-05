package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {

	private WebDriver driver;//

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	// creating a custom method for returning a webeleement
	public WebElement getelement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;

	}

	// >>>>>>>>>>>>>>>>Using string locator>>>>>>>>>>>>>>>>>>>>>>

	public By getlocator(String locatortype, String locatorvalue) {
		By locator = null;
		switch (locatortype) {
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

	// method overloading....example.....................

	public WebElement getelement(String locatortype, String locatorvalue) {
		return driver.findElement(getlocator(locatortype, locatorvalue));
	}

	// get elements return list of web elements
	public List<WebElement> getelements(By locator) {
		List<WebElement> element = driver.findElements(locator);
		return element;

	}
	// if we make method as private then we will not be able to use those method
	// outside of the class that y in utilities
	// we dont make method as private

	// creating Custom method for send keys
	public void input(By locator, String value) {
		getelement(locator).sendKeys(value);
	}

	// To click
	public void doclick(By locator) {
		getelement(locator).click();
	}

	// get text
	public String gettext(By locator) {
		return getelement(locator).getText();
	}

	// attribute value
	public String getattribute(By locator, String attrname) {
		return getelement(locator).getAttribute(attrname);

	}

	public boolean iselementdisplayed(By locator) {
		return getelement(locator).isDisplayed();
	}

	public boolean iselementenabled(By locator) {
		return getelement(locator).isEnabled();
	}

	// *************************DropDown********************************************
	public void doselectbyvisibletext(By locator, String text) {
		Select select = new Select(getelement(locator));
		select.selectByVisibleText(text);
	}

	public void doselectbyindex(By locator, int index) {
		Select select = new Select(getelement(locator));
		select.selectByIndex(index);
	}

	public void doselectbyvalue(By locator, String value) {
		Select select = new Select(getelement(locator));
		select.selectByValue(value);
		;
	}

	public List<String> getdropdownoptionList(By Locator) {
		List<String> optionValue = new ArrayList<String>();// created blank list ad add optionvalue in ths
		Select select = new Select(getelement(Locator));
		List<WebElement> optionlist = select.getOptions();
		System.out.println(optionlist.size());

		for (WebElement e : optionlist) {
			System.out.println(e.getText());
			optionValue.add(e.getText());

		}
		return optionValue;

	}

	public void selectDropDownvalue(By Locator, String Value) {
		List<String> optionValue = new ArrayList<String>();// created blank list ad add optionvalue in ths
		Select select = new Select(getelement(Locator));
		List<WebElement> optionlist = select.getOptions();
		System.out.println(optionlist.size());

		for (WebElement e : optionlist) {
			String text = (e.getText());
			if (text.equals(Value)) {
				e.click();
				break;

			}

		}
	}

	// ****************withotselect options***********************
	public void clickdropdownvalue(By locator, String value) {
		List<WebElement> dropdownlist = driver.findElements(locator);
		System.out.println(dropdownlist.size());
		for (WebElement e : dropdownlist) {
			String text = e.getText();
			if (text.equals(value)) {
				System.out.println("Pass");
				e.click();
				break;
			}
		}

	}

	// ******************WaitUtils**********************************
	// *************Alert Utils*************************
	public Alert waitforalert(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.alertIsPresent());

	}

	public String getalerttext(int timeout) {
		String text = waitforalert(timeout).getText();
		acceptalert(timeout);
		return text;
	}

	public void acceptalert(int timeout) {
		waitforalert(timeout).accept();
	}

	public void sendkeysalert(int timeout, String value) {
		waitforalert(timeout).sendKeys(value);
	}

	public WebElement waitforelementpresence(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	// *********************title Utils**************************************
	public String WaitforTitleContains(String titlevalue, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		if (wait.until(ExpectedConditions.titleContains(titlevalue))) {
			return driver.getTitle();
		}
		return null;

	}

	public String WaitforTitleIs(String fulltitle, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		if (wait.until(ExpectedConditions.titleIs(fulltitle))) {
			return driver.getTitle();
		}
		return null;

	}

	// ***************URL utilities**************************************
	public String waitforcontainsURL(String urlfraction, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		if (wait.until(ExpectedConditions.urlContains(urlfraction))) {
			return driver.getCurrentUrl();
		}
		return null;

	}

	public String waitforfullURL(String urlvalue, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		if (wait.until(ExpectedConditions.urlToBe(urlvalue))) {
			return driver.getCurrentUrl();
		}
		return null;
	}

	// **************FRAME UTLI*************************
	public void waitforframeandSwitch(String framename, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(framename));
	}

	public void waitforframeandSwitch(By framelocator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(framelocator));
	}

	public void waitforframeandSwitch(int frameindex, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameindex));
	}

	public void waitforframeandSwitch(WebElement element, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
	}

	public void waitforframeandSwitch(By framelocator, int timeout, int intervaltime) {
		WebDriverWait wait = new WebDriverWait(driver, timeout, intervaltime);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(framelocator));
	}

	// ***************WebElement Util Wait*********************************
	public WebElement waitforElementpresent(int timeout, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public WebElement waitforElementvisible(int timeout, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	// ********when element is ready to click**********************
	public void clickwhenready(By Locator, int timeout) {
		waitforelementtoclickable(Locator, timeout).click();

	}

	public WebElement waitforelementtoclickable(By Locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.elementToBeClickable(Locator));
	}
	// ***************End**************************
}
