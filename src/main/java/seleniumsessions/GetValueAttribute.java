package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetValueAttribute {

	static WebDriver driver;
	public static void main(String[] args) {
		
		//Use By.getAttribute() when you want to capture the text from Text field
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		//getAttribute() to capture the text of a text field
		
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		doSendKeys(emailId, "nagena@gmail.com");
		doSendKeys(password, "abc@1234");
		String att = driver.findElement(emailId).getAttribute("placeholder");
		System.out.println(att);
	String emailIdValue = driver.findElement(emailId).getAttribute("value");
	System.out.println(emailIdValue);
	String pwdValue = dogetAttribute(password,"value");
	System.out.println(pwdValue);
	String loginatt = driver.findElement(loginBtn).getAttribute("value");
		System.out.println(loginatt);
		String para = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/p[2]")).getText();
		System.out.println(para);
			

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

}
