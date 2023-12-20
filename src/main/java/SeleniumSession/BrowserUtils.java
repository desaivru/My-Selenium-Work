package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtils {
	

private WebDriver driver;

	public WebDriver openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	public WebDriver launchBrowser(String browserName) {
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("Please pass correct browser..");
			throw new AutomationException("Invalid Browser");
			
		}
		return driver;
	}
	
	
	public void launchUrl(String url) {
		
		//checkpoints - 1 url null, http missing
		if(url == null) {
			System.out.println("Url is null");
			throw new AutomationException("Null URL");
		}
		
		if(url.indexOf("http")== 0) {
			driver.get(url);
		}else
			throw new AutomationException("HTTP is missing");
			}
	
	
	public String getPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	
	public String getPageUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("The current url is:" +currentUrl);
		return currentUrl;
	}
	
	
	public void closeBrowser() {
		driver.close();
	}

	
	public void quitBrowser() {
		driver.quit();
	}
}
