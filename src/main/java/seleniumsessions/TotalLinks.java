package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {
	
	static WebDriver driver;

	public static void main(String[] args) {
	//Write a Program to
	/*	1. Find the total number of links present
		2. Print the text of each link
		3. print the href value of each link
*/
	//	Launch the application
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.ae");
		
		//Here you need to find the total number of links. i.e, you need to interact with multiple elements, so use findElements which will give list of web elements
	//Tagname of links are 'a'
		
	//	System.out.println(driver.findElements(By.tagName("a")).size());
	//	List<WebElement> linksList = driver.findElements(By.tagName("a"));
		// System.out.println("The total number of links in home page is equal to : " + linksList.size());
		
		By linkLists = By.tagName("a");
	//	List<WebElement> Links = getElements(linkLists);
	//	int TotalLinks = Links.size();
	//	System.out.println("Total no of links = "+TotalLinks);
		
	/*	for(WebElement e:Links)
		{
			String text = e.getText();
			if(!text.isEmpty())
			{
				System.out.println(text);
				String hrefValue = e.getAttribute("href");
				System.out.println(hrefValue);
			}
		}
	*/	
		
		//Print total links
	System.out.println("The Total Count is: " +getElementCount(linkLists));
	List <WebElement> Links = getElements(linkLists);
    printElementList(Links,"href");

	
	//Print the text of each link
	
		//Print the text of each link using for each loop (ignore the blanks). Print respective index also
/*	int	c=0;
		for(WebElement e:linksList)
		{
			String text = e.getText();
			if(!text.isEmpty())
			{
			System.out.println(c+" "+text);
			}
		
		
		//Print the href value of each link
		//For h ref use the getattribute method
			String hrefValue = e.getAttribute("href");
			System.out.println(hrefValue);
		c++;
		}	
	*/	
		//Use for loop
		
	/*	
		for(int i=0; i<linksList.size();i++)
		{
		String text1 = linksList.get(i).getText();
		if(!text1.isEmpty())
		{
		System.out.println(i+" "+text1);
		}
		String hrefValue1 = linksList.get(i).getAttribute("href");
		System.out.println(hrefValue1);
		}
	
		*/
	}
	
	public static List<WebElement> getElements(By Locator)
	{
		return driver.findElements(Locator);
	}
	
	public static int getElementCount(By Locator)
	{
		return getElements(Locator).size();
	}

	public static void printElementList(List<WebElement> List,String value)
	{
		for(WebElement e:List)
		{
			String text1 = e.getText();
			if(!text1.isEmpty())
			{
				System.out.println(text1);
				String hrefValue1 = e.getAttribute(value);
				System.out.println(hrefValue1);
			}
		}
	}
}
