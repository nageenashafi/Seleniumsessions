package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdown {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		//html tag should be 'select'
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By country = By.id("Form_submitForm_Country");
		By state = By.id("Form_submitForm_State");
//	WebElement Country_List = driver.findElement(country);
	//WebElement State_List = driver.findElement(state);
	// Select select = new Select(Country_List);
	// Select select1 = new Select(State_List);
	
	//3 ways to use select. to select value from dropdown
	//1. byindex();
	// select.selectByIndex(96);
	// select1.selectByIndex(5);
	
	//Thread.sleep(3000);
	
	//2.byvisibletext
	//select.selectByVisibleText("India");
	//select1.selectByVisibleText("Kerala");
	
	//Thread.sleep(2000);
	
	//3. byValue - selectbyValue will always work on value Attribute. Value attribute might not be available in some applications, only text would be present. In that case, selectByValue will not work. Then you will have to use SelectByVisibleText
	
	//select.selectByValue("India");
	//select1.selectByValue("Tamil Nadu");
		
		//Using generic method
	//	doSelectDropdownByIndex(country,96);
	//	Thread.sleep(2000);
	//	doSelectDropdownByIndex(state,7);
		
//		doSelectDropdownByVisibleText(country, "India");
	//	Thread.sleep(2000);
	//	doSelectDropdownByVisibleText(state, "Kerala");
		
		doSelectDropdownByValue(country, "India");
		Thread.sleep(2000);
		doSelectDropdownByValue(state, "Karnataka");
	
	}
	
	public static WebElement getElement(By Locator)
	{
		return driver.findElement(Locator);
	}

	public static void doSelectDropdownByIndex(By Locator, int index)
	{
		Select select = new Select(getElement(Locator));
				select.selectByIndex(index);
	}
	
	public static void doSelectDropdownByVisibleText(By Locator, String visibleText)
	{
		Select select = new Select(getElement(Locator));
		select.selectByVisibleText(visibleText);
	}

	public static void doSelectDropdownByValue(By Locator, String value)
	{
		Select select = new Select(getElement(Locator));
		select.selectByValue(value);
	}
	
}