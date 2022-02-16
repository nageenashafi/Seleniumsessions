package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		
		//alert: JS Alert pop up/Modal pop up
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
	Alert alert = driver.switchTo().alert();
	String text = alert.getText(); //Method 1
	System.out.println(text);
	alert.accept(); //This clicks on Ok - Method 2
//	alert.dismiss(); //This cancels the alert. Method 3. It is like clicking on Cancel. or like pressing escape key from keyboard
//	alert.sendKeys("testing"); //When there is a textbox in dialog or pop up box for user to enter the value. - Method 4
	

	}

}
