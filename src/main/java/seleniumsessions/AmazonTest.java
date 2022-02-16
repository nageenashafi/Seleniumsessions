package seleniumsessions;

public class AmazonTest {

	public static void main(String[] args) {
		
		String browser = "chrome";
		BrowserUtility br = new BrowserUtility();
		br.Init_Browser(browser);
		br.enterUrl("https://www.amazon.com");
	   // br.enterUrl("http://www.google.com");
		br.getPageTitle();
		if(br.getPageTitle().contains("Amazon"))
		{
			System.out.println("Title is as expected");
		}
		else
		{
			System.out.println("Title is not as expected");
		}
		String pageurl = br.getPageUrl();
		System.out.println(pageurl);
		if(pageurl.contains("amazon.com"))
		{
			System.out.println("Url is as expected");
		}
		else
		{
			System.out.println("url is incorrect");
		}
		br.quitBrowser();
		

	}

}
