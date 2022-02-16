package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver","C:\\Users\\nagee\\Downloads\\Compressed\\geckodriver.exe");
//Topcasting
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
	String title = driver.getTitle();
	System.out.println(title);
	if(title.equalsIgnoreCase("google"))
	{
		System.out.println("Google launched");
	}
	else
		System.out.println("Page title is not as expected");
	
	driver.quit();
		
	}

}
