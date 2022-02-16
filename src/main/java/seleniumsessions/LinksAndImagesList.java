package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksAndImagesList {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.ae");
		
		By link = By.tagName("a");
		By Image = By.tagName("img");
		
		System.out.println("The total count of links are: " + getElementCount(link));
		System.out.println("The total count of images are: " + getElementCount(Image));
		
		List<String> LinksText = getElementsTextList(link);
		System.out.println(LinksText);
		
		System.out.println("----------------------------------------------------------------------------------------------");
	//	List<String> ImageText = getElementsTextList(Image);
	//	System.out.println(ImageText);
		
	//	System.out.println("----------------------------------------------------------------------------------------------");
		
		
		
		System.out.println("----------------------------------------------------------------------------------------------");
		
		List<String> ImageAttrValue = getElementsAttributeList(Image,"src");
		System.out.println(ImageAttrValue);
		
	//	List<String> LinkAttrValue = getElementsAttributeList(link,"href");
		System.out.println(getElementsAttributeList(link,"href"));
		
	
		
	}
	
	//Generic methods for
	//1. Get Element
	public static List<WebElement> getElements(By Locator)
	{
		return driver.findElements(Locator);
	}
	//2. Total number of links
    public static int getElementCount(By Locator)
    {
    	return getElements(Locator).size();
    }
    //3. Print the link texts
    
    public static void printElementsText(By Locator)
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
    public static List<String> getElementsTextList(By Locator)
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
    public static List<String> getElementsAttributeList(By Locator, String value)
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
    
}
