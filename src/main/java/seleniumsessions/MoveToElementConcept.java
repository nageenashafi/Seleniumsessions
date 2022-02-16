package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		//move to element
		//parent to child menu

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		WebElement contentParent = driver.findElement(By.className("menulink"));
		Actions act = new Actions(driver);
		act.
			moveToElement(contentParent).
				build().
					perform();
		Thread.sleep(2000);
	//	act.click(driver.findElement(By.linkText("COURSES"))).perform(); //this performs the action(internally it builds the action and then do perform). This can be used only in case of single action. if there are multiple actions to be performed, in that case it should be .build().perform()
	//	act.click(driver.findElement(By.linkText("COURSES"))).build().perform(); //build the action and then perform the action
	//  Writing only build() is not correct i.e, act.click(driver.findElement(By.linkText("COURSES"))).build();
		driver.findElement(By.linkText("COURSES")).click();
			
		

	}

}
