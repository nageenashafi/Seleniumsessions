package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopUp {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//Pass the username and password in url itself in case of authentication pop up's. you cannot use alerts as this is not javascript pop up
	
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth"); //You cannot have @ in username and password.
		WebElement successMsg = driver.findElement(By.xpath("//div[@id='content']//p"));
		System.out.println(successMsg.getText());

	//	String username = "admin";
	//	String password = "admin";
	//	driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
		
		//2. Second solution in Selenium 4 - using CDP chrome dev protocols (CDP tools). It is a special configuration for basic authentications
	}

}
