package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementDisplay {
	
	static WebDriver driver;

	public static void main(String[] args) {
	
		//Use isDisplayed() method to check if an element is displayed or not
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		By emailId = By.id("input-email");
	/*	if(driver.findElement(emailId).isDisplayed())
		{
			doSendKeys(emailId,"nagina@gmail.com");
		}
*/
		if(doisDisplayed(emailId))
		{
			doSendKeys(emailId, "nagna@gmail.com");
		}
		//isEnabled() - element is displayed but is disabled. returns boolean value
		
		driver.findElement(emailId).isEnabled();
		//if visible on the page, but disabled, it will return false.
		//if visible on the page and enabled, then returns true.
		
		//Another method is to select the check box which will be covered in a different session.
		//Never create your webdriver static in your framework. or else you wont be able to achieve multithreading. This will create a deadlock situation. ie, webdriver wont be able to used for parallel execution
		//If not defined as static, then each object will be given a copy of webdriver and parallel execution is possible.
		
		
	}
	
	public static void doClick(By Locator)
	{
		getElement(Locator).click();
	}
	
	public static WebElement getElement(By Locator)
	{
		return driver.findElement(Locator);
	}
	
	public static void doSendKeys(By Locator, String value)
	{
	getElement(Locator).sendKeys(value);	
	}
	
	public static String dogetText(By Locator)
	{
	return getElement(Locator).getText();
	}
	
	public static String dogetAttribute(By Locator, String attrName)
	{
		return getElement(Locator).getAttribute(attrName);
	}
	
	public static boolean doisDisplayed(By Locator)
	{
		return getElement(Locator).isDisplayed();
	}


}
