package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtilAssignment {
	
	private WebDriver driver;
	
	public ElementUtilAssignment(WebDriver driver)
	{
		this.driver = driver;
	}
	
public WebElement getElement(By Locator)
	
	{
		return driver.findElement(Locator); 
	}
	
	public void doSendKeys(By Locator, String Value)
	{
		getElement(Locator).sendKeys(Value);
	}
	
	public void doClick(By Locator)
	{
		getElement(Locator).click();
	}
	
	public String dogetText(By Locator)
	{
		return getElement(Locator).getText();
	}

}
