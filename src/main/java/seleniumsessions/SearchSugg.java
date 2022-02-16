package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchSugg {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/");
		
		driver.findElement(By.id("search_query_top")).sendKeys("dress");
		
		Thread.sleep(4000);
		
//	WebElement ele = driver.findElement(By.xpath("//div[@class='ac_results']//li[contains(text(),'Casual Dresses > Printed')]"));
//	ele.click();
		
		//Using for loop
		
	//	By ele = By.xpath("//div[@class='ac_results']//li");
	//	printElementList(ele,"Chiffon");
		
		selectSuggestion("Casual Dresses > Printed");
		
		}
	
	public static List<WebElement> getElements(By Locator)
	{
		return driver.findElements(Locator);
	}

	public static void printElementList(By Locator,String Value)
	{
		List<WebElement> eleList = getElements(Locator);
		for(WebElement e:eleList)
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
	
	public static void selectSuggestion(String suggestion)
	{
		WebElement ele = driver.findElement(By.xpath("//div[@class='ac_results']//li[contains(text(),'"+suggestion+"')]"));
     	ele.click();
	}
	
}
