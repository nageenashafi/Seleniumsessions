package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WDMConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	//	WebDriverManager.firefoxdriver().setup();
		//If you want to use a downgraded version of browser
	//	WebDriverManager.chromedriver().browserVersion("87.0").setup(); - For this, you need to downgrade ur browser to 87.0 manually, this command will only download the 87.0 exe file for chromedriver
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.google.com");
		 System.out.println("Title is: " + driver.getTitle());
		 
		 driver.quit();
		 
		 

	}

}
