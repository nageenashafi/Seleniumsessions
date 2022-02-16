package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterAssignment {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
	//	driver.findElement(By.linkText("Register")).click();
	//driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Nageena");
		//driver.findElement(By.name("lastname")).sendKeys("Shafi");		
		//driver.findElement(By.id("input-email")).sendKeys("nageena.shafi3@gmail.com");		
	//		driver.findElement(By.id("input-telephone")).sendKeys("00971564750023");	
//		driver.findElement(By.id("input-password")).sendKeys("Test@1234");
		//	driver.findElement(By.id("input-confirm")).sendKeys("Test@1234");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input")).click();
	//driver.findElement(By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)")).click();	
	//driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();	
	//	   String text = driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();
		
		
		By link = By.linkText("Register");	
		By FirstName = By.xpath("//*[@id=\"input-firstname\"]");
		By LastName = By.name("lastname");	
		By EmailId = By.id("input-email");
			By PhoneNo = By.id("input-telephone");	
			By password = By.id("input-password");
		By confirmpwd = By.id("input-confirm");		
		By SubscriberadioBtn = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");		
		By Checkbox = By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)");	    
	    By ContinueBtn = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");	
	    By header = By.xpath("//*[@id=\"content\"]/h1");
	/*    
	   doClick(link);
	   doSendKeys(FirstName,"Nageena");
	    doSendKeys(LastName, "Shafi");
	    doSendKeys(EmailId,"nageena.shafi4@gmail.com");
	   	    doSendKeys(PhoneNo, "971564750023");
	   	 doSendKeys(password,"Test@1234");
	    doSendKeys(confirmpwd,"Test@1234");
	    doClick(SubscriberadioBtn);
	    doClick(Checkbox);
	    doClick(ContinueBtn);
	    doClick(link);
	     String text = dogetText(header);
	    
	    */
	    ElementUtilAssignment eleUtilAss = new ElementUtilAssignment(driver);
	    eleUtilAss.doClick(link);
	    eleUtilAss.doSendKeys(FirstName,"Nageena");
	    eleUtilAss.doSendKeys(LastName, "Shafi");
	    eleUtilAss.doSendKeys(EmailId,"nageena.shafi5@gmail.com");
	    eleUtilAss.doSendKeys(PhoneNo, "971564750023");
	    eleUtilAss.doSendKeys(password,"Test@1234");
	    eleUtilAss.doSendKeys(confirmpwd,"Test@1234");
	    eleUtilAss.doClick(SubscriberadioBtn);
	    eleUtilAss.doClick(Checkbox);
	    eleUtilAss.doClick(ContinueBtn);
	 String text = eleUtilAss.dogetText(header);	
	   System.out.println(text);
	   if(text.equalsIgnoreCase("your account has been created!"))
	   {
		   System.out.println("Header is as expected");
	   }
	}

	public static WebElement getElement(By Locator)
	
	{
		return driver.findElement(Locator); 
	}
	
	public static void doSendKeys(By Locator, String Value)
	{
		getElement(Locator).sendKeys(Value);
	}
	
	public static void doClick(By Locator)
	{
		getElement(Locator).click();
	}
	
	public static String dogetText(By Locator)
	{
		return getElement(Locator).getText();
	}
}
