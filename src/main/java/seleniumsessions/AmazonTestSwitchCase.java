package seleniumsessions;

public class AmazonTestSwitchCase {

	public static void main(String[] args) {
		
		String browser = "firefox";
		BrowserUtilSwitchCase br1 = new BrowserUtilSwitchCase();
		br1.initbrowser_switchcase(browser);
		br1.enterUrl("https://www.amazon.com");
	   // br.enterUrl("http://www.google.com");
		br1.getPageTitle();
		if(br1.getPageTitle().contains("Amazon"))
		{
			System.out.println("Title is as expected");
		}
		else
		{
			System.out.println("Title is not as expected");
		}
		String pageurl = br1.getPageUrl();
		System.out.println(pageurl);
		if(pageurl.contains("amazon.com"))
		{
			System.out.println("Url is as expected");
		}
		else
		{
			System.out.println("url is incorrect");
		}
		br1.quitBrowser();
		

	}

}
