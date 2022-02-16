package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {
	
	static WebDriver driver;

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.ae");
		
		//Total Images
		//Print alt of images
		//Print src of images
		List<WebElement> imagesList = driver.findElements(By.tagName("img"));
		System.out.println("Total no.of images in page is: "+imagesList.size());
		
		
		for(WebElement e:imagesList)
		{
			String altValue = e.getAttribute("alt");
	//				System.out.println(altValue);
			String srcValue = e.getAttribute("src");
			System.out.println(altValue+" : " + srcValue);
		}
		
		

	}

}
