package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuitVsClose {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
						driver.get("https://www.google.com");
						String title = driver.getTitle();
			System.out.println("The title is: "+title);
			
						
			if(title.equalsIgnoreCase("google"))
			{
				System.out.println("Correct Title");
			}
			else
			{
				System.out.println("Incorrect Title");
			}
		
			System.out.println(driver.getCurrentUrl());
			
			//1. quit() - Browser is closed. If you want to run again, reinitialise the browser again
			
			driver.quit();
			//2. close()
			//driver.close();
driver = new ChromeDriver();
			System.out.println(driver.getCurrentUrl());
	}

}
