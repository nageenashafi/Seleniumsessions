package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	
    static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("naveen automation labs");
		Thread.sleep(3000);
		
		
	/* List<WebElement> suggList = driver.findElements(By.xpath("//ul[@role='listbox']//div[@class='wM6W7d']/span"));
	System.out.println(suggList.size());
	
	for(WebElement e:suggList)
	{
		String text = e.getText();
		if(text.contains("git"))
		{
			e.click();
			break;
		}
	}
	
	*/
//		By suggList = By.xpath("//ul[@role='listbox']//div[@class='wM6W7d']/span");
	//	getSuggList(suggList,"resume");
		
		selectGoogleSearchSuggestion("api testing");
		
	}
	
	public static List<WebElement> getElements(By Locator)
	{
		return driver.findElements(Locator);
	}
	
	public static void getSuggList(By Locator, String Value)
	{
		List<WebElement> SuggLists = getElements(Locator);
		System.out.println("The total no of suggestions available is equal to: "+SuggLists.size());
		for(WebElement e:SuggLists)
		{
			String text = e.getText();
			System.out.println(text);
			if(text.contains(Value))
			{
				e.click();
				break;
			}
		}
		
			}
	public static void selectGoogleSearchSuggestion(String Suggestion)
	{
		WebElement suggList = driver.findElement(By.xpath("//div[@role='option']/div[@class='wM6W7d']/span[contains(text(),'"+Suggestion+"')]"));
		suggList.click();
	}
}
