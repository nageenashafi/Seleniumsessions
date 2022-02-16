package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryDropdownHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
		
	//	List<WebElement> choicesList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		
		By choices = By.xpath("//span[@class='comboTreeItemTitle']");
		
		
		//TC_1 : Single selection
	//	selectChoice(choices,"choice 2 2");
		
		//TC_2: Multi selection
	//	selectChoice(choices,"choice 1","choice 2","choice 6 2 1");
		
		//TC_3: Select all choices
	//	selectChoice(choices,"all");
		
		//TC_4 Choice is not available
		
	//	selectChoice(choices,"choice 8");
		
		//TC_5 Multiple values with one or more choices not available
		selectChoice(choices, "choice 1", "choice 7", "choice 9");
	/*	for(WebElement e:choicesList)
		{
			String text = e.getText();
			System.out.println(text);
			if(text.equals("choice 1"))
			{
				e.click();
			break;
		}
		
			
		}
		*/
	}
	
	public static void selectChoice(By Locator, String... Value)
	{
     List<WebElement> choicesList = driver.findElements(Locator);
		
		boolean flag = false;
			if(!Value[0].equalsIgnoreCase("all"))
			{
				for(WebElement e:choicesList)
				{
					String text = e.getText();
					
			for(int i=0;i<Value.length;i++)
			{
				if(text.equals(Value[i]))
				{
					flag = true;
								e.click();
								System.out.println(text);
				break;
			}
				else flag = false;
			}
				}
			}
			
			//Select all choices logic
			else
			{
				try
			{
					for(WebElement e:choicesList)
										e.click();
					flag=true;
			}
			
			catch(ElementNotInteractableException e)
				{
				System.out.println("All choices are over....");
				}
				
				}
			if(flag==false)
			{
				System.out.println("Choice is not available.");
			}
		
		
	}
		
	
	}

