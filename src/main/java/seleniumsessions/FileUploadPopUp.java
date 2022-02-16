package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUp {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		//The choose file button can be any html tag. But the type should be 'file'. This attribute property should be present. Then lnly the below logic/formula works
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\nagee\\Downloads\\MindMap for testers.jfif");
		

	}

}
