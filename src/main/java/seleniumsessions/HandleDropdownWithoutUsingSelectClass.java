package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropdownWithoutUsingSelectClass {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
				By country = By.xpath("//select[@id='Form_submitForm_Country']/option");
		        By state = By.xpath("//select[@id='Form_submitForm_State']/option");
		        
		        SelectValuefromDropdownWithoutSelectMethod(country,"India");
		        Thread.sleep(2000);
		        SelectValuefromDropdownWithoutSelectMethod(state,"Kerala");
		        

	}
	
	public static List<WebElement> getElement(By Locator)
	{
		return driver.findElements(Locator);
				
	}
	
	public static void SelectValuefromDropdownWithoutSelectMethod(By Locator, String Value)
	
	{
		   List<WebElement> CountryList = getElement(Locator);
	        for(WebElement e:CountryList)
	        {
	        	String text = e.getText();
	        	 	if(text.equals(Value))
	        	{
	        		e.click();
	        	   		break;
	        	}
	        }
	}

}
