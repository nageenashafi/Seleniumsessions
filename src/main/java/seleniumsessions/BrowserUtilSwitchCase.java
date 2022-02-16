package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtilSwitchCase {

	private WebDriver driver;
	/**
	 * Initialize browser using Switch case logic
	 * @param browser
	 * @return driver
	 */
	
	public WebDriver initbrowser_switchcase(String browser)
	{
		switch(browser.toLowerCase())
		{
			case "chrome":
				WebDriverManager.chromedriver().setup();
			//	System.setProperty("wedriver.chrome.driver", "C:\\Users\\nagee\\Downloads\\Compressed\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
			
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
			//	System.setProperty("wedriver.gecko.driver", "C:\\Users\\nagee\\Downloads\\Compressed\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
			
			case "Safari":
				driver = new SafariDriver();
				break;
				
				default:
					System.out.println("Pass the correct browser");
					break;
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
