package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept {

	static WebDriver driver;

		public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
			By Drag = By.id("draggable");
			By Drop = By.id("droppable");
			Actions act = new Actions(driver);
			WebElement sourceElement = driver.findElement(Drag);
			WebElement targetElement = driver.findElement(Drop);
			
		//	act.clickAndHold(sourceElement).moveToElement(targetElement).release(targetElement).build().perform();
			act.dragAndDrop(sourceElement, targetElement).perform();

	}

}
