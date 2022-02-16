package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {

	static WebDriver driver;
	public static void main(String[] args) {
	
		// The fields or elements of a page are the web element.
		
		//Right click on the oage and click Inspect. Click on Inspect button at the top left corner to inspect any web element
		//HTML DOM will be displayed - DOM is Document Object Model
		//Every element in page will have the following
		//	- < is the html tag
			//- Then attributes and attribute value. There can be attributes with no value. It will be in the key and pair format
//Whenever you want to send any value, you need to use sendkey() method
// Whenever you want to click on any element, you need to use click() method
		
		//Locator Strategies : What are the different locators in Selenium
		//1. id locator (byid) - I most preferred
		 //Launch the webdriver
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
	//First create a web element
		//Create web element using By locator
		//Create WE + action (SendKeys, click, isDisplayed
		
	//	driver.findElement(By.id("input-email")).sendKeys("nav@gmail.com");
		//driver.findElement(By.id("input-password")).sendKeys("test@123");
		
		//2. Create Web Element once and hit the serve only once. Store it and use it whenever you want.
		//WebElement emailId = driver.findElement(By.id("input-email"));
	//WebElement password = 	driver.findElement(By.id("input-password"));
	
	//emailId.sendKeys("nav@gmail.com");
//password.sendKeys("test@123");		
	//	emailId.sendKeys("tom@gmail.com");
		
		// 3. By locator - Use By.method directly

   //   By emailID = By.id("input-email");
   //   By pwd = By.id("input-password");
      
  // WebElement emailId = driver.findElement(emailID);
  // WebElement password = driver.findElement(pwd);
   
  // emailId.sendKeys("nav@gmail.com");
  // password.sendKeys("test@123");
   
   //4. By locator with generic method
   
 //  By emailId = By.id("input-email");
  // By pwd = By.id("input-password");
   
  // getElement(emailId).sendKeys("naveen@gmail.com");
   // getElement(pwd).sendKeys("test@123");
   
   //5. By locator with getElement and actions generic method:
      
 /*  By EmailId = By.id("input-email");
  By pwd = By.id("input-password");
  doSendKeys(EmailId,"nag@gmail.com");
  doSendKeys(pwd, "test@123");
 */ 
  //6. By locator with getElement and action generic method in Util class
		
	/*	By emailId = By.id("input-email");
		By pwd = By.id("input-password");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(emailId, "nageena@gmail.com");
		eleUtil.doSendKeys(pwd,"abc@123");
	*/
		
	//7. String locator with By, getElement and action generic method in Util class
		
		String EmailId = "input-email";
		String pwd = "input-password";
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		eleUtil.doSendKeys("ID",EmailId,"nageena1@gmail.com");
		eleUtil.doSendKeys("id",pwd,"abcd@1234");
		
      
	}
	
//Create a static generic getElement method
	/*
	public static By getBy(String LocatorType, String LocatorValue)
	{
		By Locator = null;
		switch(LocatorType.toLowerCase())
		{
		case "id":
		Locator = By.id(LocatorValue);
			break;
			default:
				break;
		}
		return Locator;
		}
	
	public static WebElement getElement(By Locator)
	{
		return driver.findElement(Locator);			
	}
	
	public static void doSendKeys(By Locator, String value)
	{
		getElement(Locator).sendKeys(value);
	}
	
	//Method Overload
	
	public static void doSendKeys(String LocatorType, String LocatorValue, String value)
	{
		getElement(getBy(LocatorType, LocatorValue)).sendKeys(value);		
	}
	*/
}
