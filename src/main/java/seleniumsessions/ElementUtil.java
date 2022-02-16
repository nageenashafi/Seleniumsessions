package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public By getBy(String LocatorType, String LocatorValue)
	{
		By Locator = null;
		switch(LocatorType.toLowerCase())
		{
		case "id":
		Locator = By.id(LocatorValue);
			break;
		case "name":
			Locator = By.name(LocatorValue);
				break;
		case "classname":
			Locator = By.className(LocatorValue);
				break;
		case "xpath":
			Locator = By.xpath(LocatorValue);
				break;
		case "css":
			Locator = By.cssSelector(LocatorValue);
				break;
		case "linktext":
			Locator = By.linkText(LocatorValue);
				break;
		case "partiallinktext":
			Locator = By.partialLinkText(LocatorValue);
				break;
		case "tagname":
			Locator = By.tagName(LocatorValue);
				break;
			
			default:
			break;
		}
		return Locator;
		}
		
	public WebElement getElement(By Locator)
	{
		return driver.findElement(Locator);
	}
	
	public void doSendKeys(By Locator, String value)
	{
		getElement(Locator).sendKeys(value);
	}
	
	//Method Overload
	
		public void doSendKeys(String LocatorType, String LocatorValue, String value)
		{
			getElement(getBy(LocatorType, LocatorValue)).sendKeys(value);		
		}
		
		public void doClick(By Locator)
		{
			getElement(Locator).click();
		}
		//Overload
		public void doClick(String LocatorType, String LocatorValue)
		{
			getElement(getBy(LocatorType,LocatorValue)).click();
		}
		
		public String dogetText(By Locator)
		{
		return getElement(Locator).getText();
		}
		
		public String dogetAttribute(By Locator, String attrName)
		{
			return getElement(Locator).getAttribute(attrName);
		}
		
		public boolean doisDisplayed(By Locator)
		{
			return getElement(Locator).isDisplayed();
		}
	
		//1. Get Element
		public List<WebElement> getElements(By Locator)
		{
			return driver.findElements(Locator);
		}
		//2. Total number of links
	    public  int getElementCount(By Locator)
	    {
	    	return getElements(Locator).size();
	    }
	    //3. Print the link texts
	    
	    public void printElementsText(By Locator)
	    {
	    	List<WebElement> eleList = getElements(Locator);
	    	for(WebElement e: eleList)
	    	{
	    		String text = e.getText();
	    		if(!text.isEmpty())
	    		{
	    			System.out.println(text);
	    		}
	    	}
	    }
	    
	    //4. This method will return the list of element's text
	    public List<String> getElementsTextList(By Locator)
	    {
	    	List<WebElement> eleList = getElements(Locator);
	    	List<String> eleTextList = new ArrayList<String>();
	    	for(WebElement e: eleList)
	    	{
	    		String text = e.getText();
	    	//	if(!text.isEmpty())
	    		//	{
	    			eleTextList.add(text);
	   // 	}
	        	}
			return eleTextList;
	    }
	    
	    //5. This method will return the Element's attribute value
	    public List<String> getElementsAttributeList(By Locator, String value)
	    {
	    	List<WebElement> eleList = getElements(Locator); //Capture the complete list first i.e, list of webElement
	    	List<String> eleAttrList = new ArrayList<String>(); //Maintain a blank array list of type string
	    	for(WebElement e: eleList)
	    	{
	    		String AttrVal = e.getAttribute(value);
	    		eleAttrList.add(AttrVal);
	    	}
	    	return eleAttrList;
	    	}
	
	    /*************************************************Dropdown Utils*************************************************************/
	    
	    public void doSelectDropdownByIndex(By Locator, int index)
		{
			Select select = new Select(getElement(Locator));
					select.selectByIndex(index);
		}
		
		public void doSelectDropdownByVisibleText(By Locator, String visibleText)
		{
			Select select = new Select(getElement(Locator));
			select.selectByVisibleText(visibleText);
		}

		public void doSelectDropdownByValue(By Locator, String value)
		{
			Select select = new Select(getElement(Locator));
			select.selectByValue(value);
		}
		
		public int getDropdownOptionsCount(By Locator)
		{
			Select select = new Select(getElement(Locator));
			return select.getOptions().size();
		}
	    
		public List<String> getDropdownOptionsList(By Locator)
		{
			Select select = new Select(getElement(Locator));
					List<WebElement> optionsList = select.getOptions();
				List<String> optionsTextList = new ArrayList<String>();	
				System.out.println(optionsList.size());
			for(WebElement e:optionsList)
			{
				String text = e.getText();
				optionsTextList.add(text);
			}
			return optionsTextList;
						
		}
		
		public void selectValueFromDropdown(By Locator,String Value)
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
	/**************************************Action Methods*****************************************/
		
		public void actiondoSendKeys(By Locator, String Value)
		{
			Actions act = new Actions(driver);
			act.sendKeys(getElement(Locator),Value).perform();
		}
		
		public void actiondoClick(By Locator)
		{
			Actions act = new Actions(driver);
			act.click(getElement(Locator)).perform();
		}

}
