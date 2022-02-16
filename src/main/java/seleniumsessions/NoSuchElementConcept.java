package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoSuchElementConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

		driver.findElement(By.id("input-email1")).sendKeys("test@gmail.com"); //When Selenium is not able to find the element using the given locator, it will give no such element exception.
		//Invalid selector - syntax error
		//You can change the locator or locator strategy to make this work or rectify the issue.
	}

}
