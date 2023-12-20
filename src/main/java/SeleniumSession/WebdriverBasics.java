package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebdriverBasics {
	
		
		static WebDriver driver;

		public static void main(String[] args) {
			//Open browser : chrome
			// Enter the Url
			//get the title
			//Verify the title
			//close the browser
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
			//FirefoxDriver driver = new FirefoxDriver();
			
//			String browser = "Chrome";
//			//can achieve cross browser with topcasting - parallel testing
//			switch (browser.toLowerCase().trim()) {
//			case "chrome":
//				driver = new ChromeDriver();
//				break;
//			case "firefox":
//				driver = new FirefoxDriver();
//				break;
//			case "edge":
//				driver = new EdgeDriver();
//				break;
//			case "safari":
//				driver = new SafariDriver();
//				break;
//
//			default:
//				System.out.println("Please pass right browser...");
//				break;
//			}
//			
//			//topcasting
////			WebDriver driver = new ChromeDriver();
//			
//			driver.get("https://www.google.com");
//			String expectdTitle = "Google";
//			
//			String Actualtitle = driver.getTitle();
//			System.out.println("Title is:" +Actualtitle);
//			
//			if(Actualtitle.equals(expectdTitle) ) {
//				System.out.println("Title is correct: Pass");
//				}
//			else {
//				System.out.println("Incorect Title: Failed");
//			}
//			
//			String currUrl = driver.getCurrentUrl();
//			driver.close();
//
		}

	
}
