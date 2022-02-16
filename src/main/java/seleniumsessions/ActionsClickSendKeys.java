package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClickSendKeys {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		By fn = By.id("input-firstname");
		By ln = By.id("input-lastname");
		By email = By.id("input-email");
		By phone = By.id("input-telephone");
		By pwd = By.id("input-password");
		By cpwd = By.id("input-confirm");
		By Subscribe = By.xpath("//label[@class='radio-inline']/input[@value='1']");
		By checkbox = By.xpath("//input[@type='checkbox']");
		By CtnBtn = By.xpath("//input[@value='Continue']");
		
		
	//	Actions act = new Actions(driver);
	//	act.sendKeys(driver.findElement(fn),"Nageena").perform();
	//	act.click(driver.findElement(checkbox)).perform();
	//	act.click(driver.findElement(CtnBtn)).perform();
		
		actiondoSendKeys(fn,"Nageena");
		actiondoSendKeys(ln,"Shafi");
		actiondoSendKeys(email,"nageena.shafii@gmail.com");
		actiondoSendKeys(phone,"971564750023");
		actiondoSendKeys(pwd,"Test@123");
		actiondoSendKeys(cpwd,"Test@123");
		actiondoClick(Subscribe);
		actiondoClick(checkbox);
		actiondoClick(CtnBtn);
			

	}
	
	public static WebElement getElement(By Locator)
	{
		return driver.findElement(Locator);
	}

	public static void actiondoSendKeys(By Locator, String Value)
	{
		Actions act = new Actions(driver);
		act.sendKeys(getElement(Locator),Value).perform();
	}
	
	public static void actiondoClick(By Locator)
	{
		Actions act = new Actions(driver);
		act.click(getElement(Locator)).perform();
	}
}
 