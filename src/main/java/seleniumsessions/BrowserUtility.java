package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtility {

	private WebDriver driver; //driver cannot be accessed outside of this class directly. Call driver via method. Or else anyone can create an object of this class and try to access this. They will be getting the default value null unnecessarily.
	
	/**
	 * This method is used to initialize the driver on the basis of browser name
	 * @param browser
	 * @return This returns WebDriver
	 */
	
	public WebDriver Init_Browser(String browser)
	{
		System.out.println("Browser is : " +browser);
		if(browser.equalsIgnoreCase("Chrome"))
		{
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagee\\Downloads\\Compressed\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\nagee\\Downloads\\Compressed\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Safari"))
		{
			driver = new SafariDriver();
		}
		else
		{
			System.out.println("Please pass the correct browser"); //In this case, when there is no matching case, then null will be returned as default value of an object or class is null
		}
		return driver;
	}
	
	/**
	 * This is to launch the url
	 * @param url
	 */
	
	public void enterUrl(String url)
	{
		System.out.println("The url is: "+ url);
		if(url.contains("http")||url.contains("https"))
		{
			driver.get(url);
		}
		else
		{
			System.out.println("Please pass the correct url");
		}
	}
	
	/**
	 * This is to get the Page title
	 */
	public String getPageTitle()
	{
		return driver.getTitle();
	}
		
	public String getPageUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public void quitBrowser()
	{
		driver.quit();
	}
	
    public void closeBrowser()
    {
    	driver.close();
    }
	
}
