package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {
	
		//Frame is a Webelement.
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		String header = driver.findElement(By.xpath("/html/body/h2")).getText(); //Directly entering the path using any locator will not give you the expected output. It willl give element not found exception. as this element is not directly present in page, instead it is present in a frame.
//      Inside the frames also, webelements are present. Driver cannot directly handle the webelements present inside a frame. Driver should first switch to frame and then access. Driver should be available inside the frame for it to interact with the webelemnts
		//Frame also is a webelemnt. it  is part of html dom
		//Frame has its own html dom. so driver should be present inside the frame for it to interact with the webelements
		//You should switch back to the page , then only the driver can access the web elements in page.
		// System.out.println(header);
	}

}
