package seleniumsessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {

	public static void main(String[] args) throws MalformedURLException {
		WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	String title = driver.getTitle();	
	System.out.println("Title is : "+title);
	
	//navigate method is available to enter the url to navigate between browsers
	
		//driver.navigate().to("https://www.amazon.com");
	driver.navigate().to(new URL("https://www.amazon.com"));
	System.out.println(driver.getTitle());
	
	driver.navigate().back();
	System.out.println(driver.getTitle());
	
	driver.navigate().forward();
	System.out.println(driver.getTitle());
	
	driver.navigate().back();
	System.out.println(driver.getTitle());
	
	//to refresh the page
	driver.navigate().refresh();
	
	//Difference between driver.get() and driver.navigate() - Both are synonyms. Both are doing exactly the same. Both are waiting to load the pages in web window
	//You can use navigate().back and forward with or without passing the url in navigate method as bot get and navigate are exactly same
	//difference between get and navigate. Using navigate method we can go back and forward using .back() and .forward() methods.We cannot use back and forward using get method
	
	
		

	}

}
