package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdownAllOptions {
	
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		
		By country = By.id("Form_submitForm_Country");
		By state = By.id("Form_submitForm_State");
		
	//	Select select = new Select(driver.findElement(country));
		
//	List<WebElement> optionsList = select.getOptions();
//	int Optionssize = optionsList.size();
	// System.out.println("The total number of countries in Country dropdown equals: "+Optionssize);
	
	//Get all the listed countries
	
//	int i=0;
	
//	for(WebElement e:optionsList)
//	{
//		String text = e.getText();
	//	System.out.println(i+ " " +text);
	//	i++;
//	}
		
		if(getDropdownOptionsList(country).contains("Australia"))
				{
			System.out.println("Australia is present in dropdown");
				}
		
		selectValueFromDropdown(country,"India");
		
	}
	
	
	public static WebElement getElement(By Locator)
	{
		return driver.findElement(Locator);
	}

	public static List<String> getDropdownOptionsList(By Locator)
	{
		Select select = new Select(driver.findElement(Locator));
				List<WebElement> optionsList = select.getOptions();
			List<String> optionsTextList = new ArrayList<String>();	
			System.out.println(optionsList.size());
		for(WebElement e:optionsList)
		{
			String text = e.getText();
			//System.out.println(text);
			optionsTextList.add(text);
		}
		return optionsTextList;
			
			
	}
	
	public static void selectValueFromDropdown(By Locator,String Value)
	{
		Select select = new Select(getElement(Locator));
		List<WebElement> optionsList = select.getOptions();
		for(WebElement e:optionsList)
			{
			String text = e.getText();
			System.out.println(text);
			if(text.equals(Value))
			{
				e.click();
				break;
			}
			}

}
}
