package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//Chrome server	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagee\\Downloads\\Compressed\\chromedriver.exe");
	//Automation Steps:
	//1. initialize chrome driver
	//top casting:
		WebDriver driver = new ChromeDriver();
		//2. Launch URL. use the driver.get() method
		driver.get("https://www.google.com");
		//3. Now get the title of the page. For that getTitle() method is there
		String title = driver.getTitle();
		System.out.println("The title is: "+title);
		
		//4. Verification point/Checkpoint/Actual vs Expected
		
		if(title.equalsIgnoreCase("google"))
		{
			System.out.println("Title is as expected");
		}
		else
			System.out.println("Title is not as expected");
		// = Automation testing
		
		driver.get("https://www.facebook.com");
		String Title1 = driver.getTitle();
		System.out.println("The new page title is :" +Title1);
		if(Title1.contains("Facebook"))
		{
			System.out.println("Title is correct");
		}
		else
			System.out.println("Title is incorrect");
			
		//Get the current url
		System.out.println(driver.getCurrentUrl());
		
		//Get the page source
		System.out.println(driver.getPageSource());
		//Close the browser once your work is done
		if(driver.getPageSource().contains("HasteSupportData"))
			System.out.println("String present");
		else
			System.out.println("String not present");
		
		driver.quit();
	
	
	}
	
	
	
	
	

}
