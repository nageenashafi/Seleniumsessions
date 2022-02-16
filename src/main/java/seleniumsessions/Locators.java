package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		//1. Locator - id - this will be unique - I
		
		//2. Locator - name - this can be duplicate - II
		
	//	driver.findElement(By.name("email")).sendKeys("nageena@gmail.com");
		
		//3. class name: - IV
		//id, name and class are attributes	
	//	driver.findElement(By.className("form-control")).sendKeys("nag@gmail.com");
		
          //4. xpath - is not an attribute - III
		//xpath is the address of the element in HTML DOM
		//There are 2 types of xpath
		//1. absolute xpath
		//2. relative xpath
		//driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gmail.com");
	//	driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test@123");
	//	driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		
		//Generic Method for .click()
	/*	By emailId = By.xpath("//*[@id=\"input-email\"]");
		By pwd = By.xpath("//*[@id=\"input-password\"]");
		By loginBtn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		
		ElementUtil eleUtil = new ElementUtil(driver); 
		eleUtil.doSendKeys(emailId,"nage@gmail.com");
		eleUtil.doSendKeys(pwd,"abcd@1234");
		eleUtil.doClick(loginBtn);
	*/	
			//5. CSS selector - not an attribute. CSS - Cascaded Style Sheet - III
/*	By emailId = By.cssSelector("#input-email");
	By password = By.cssSelector("#input-password");
	By LoginBtn = By.cssSelector("#content > div > div:nth-child(2) > div > form > input");
	
	ElementUtil eleUtil = new ElementUtil(driver);
	
	eleUtil.doSendKeys(emailId,"nageen@gmail.com");
	eleUtil.doSendKeys(password,"abc@123");
	eleUtil.doClick(LoginBtn);
	*/
		
		//6. linkText: only applicable for links - V
		
//	For ex - if you want to click on a link
		//Every link will have HTML tag as 'a' tag <a>. If there is an 'a' tag, it means it is a link. a is angle tag.
		//Whenever you want to click on a link, First, figure out if it is a link or not using a tag and then click on it. Every link has certain properties. for ex - href - hyperlink reference
	//property where you are to be navigated. Most of the time, every link will have a text over there. for ex - register, login etc which is the element text
	//	driver.findElement(By.linkText("Register")).click();
		
/*		By link = By.linkText("Register");
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doClick(link);
		
		*/
		
		//7. partialLinkText : only for links <a>
	//	driver.findElement(By.partialLinkText("Forgotten")).click();
	/*	By partialLink = By.partialLinkText("Forgot");
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doClick(partialLink);
	*/
		//8. tagName: html tag <h2> - header type is called tag name , not on the attribute not on the properties of element, tag name always work on the tag name of element. Can be used only for headers, links, want to fetch something from text etc
				
		//You can only capture the text of the tag. Use getText() method. return type of getText() is String.
	//String header = driver.findElement(By.tagName("h2")).getText();
	//System.out.println(header);
		By register = By.linkText("Register");
				By header = By.tagName("h2");
	System.out.println(dogetText(register));
	System.out.println(dogetText(header));
	 //Use getText() method when you want to capture any text of an element. use it with any locator to capture any text in a page of an element
	
	
	}
	
	//Generic Method for .click()
	
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
}
