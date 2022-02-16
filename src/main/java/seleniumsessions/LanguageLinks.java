package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LanguageLinks {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		driver.get("https://www.google.in");
		
	/*	List<WebElement> LangLists = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		System.out.println(LangLists.size());
		
		for(WebElement e:LangLists)
		{
			String Lang = e.getText();
			System.out.println(Lang);
		if(Lang.equals("हिन्दी"))
			{
				e.click();
				break;
		}
}
		
*/
//		By LangLink = By.xpath("//div[@id='SIvCob']/a");
	//	driver.get("https://www.freshworks.com");
	//	By Link = By.xpath("//ul[@class='footer-nav']//a");
	//	System.out.println(getElements(Link).size());
	//	ClickOnLink(Link,"Careers");
		
		
		System.out.println("------------------");
		
	//	By Footer = By.xpath("//div[@class='footer-nav copyrights-nav hide-in-mobile']/a");
	//	System.out.println(getElements(Footer).size());
	//	ClickOnLink(Footer,"Takedown Policy");
	//	
		driver.get("https://www.google.in");
		By LangLink = By.xpath("//div[@id='SIvCob']/a");
		ClickOnLink(LangLink,"English");
		By GoogleFooter = By.xpath("//div[@class='KxwPGc SSwjIe']//a");
		System.out.println(getElements(GoogleFooter).size());
		ClickOnLink(GoogleFooter, "Privacy");
		
		
	//	System.out.println(getElements(LangLink).size());
	//	ClickOnLink(LangLink,"فارسی");
		
	}
	
	public static List<WebElement> getElements(By Locator)
	{
		return driver.findElements(Locator);
	}
	
	public static void ClickOnLink(By Locator,String Lang)
	{
			List<WebElement> LangList = getElements(Locator);
			for(WebElement e:LangList)
			{
			String text = e.getText();
			System.out.println(text);
			if(text.contains(Lang))
			{
				e.click();
				break;
			}
			}
	}

}
