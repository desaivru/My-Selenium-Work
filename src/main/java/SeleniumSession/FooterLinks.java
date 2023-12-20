package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinks {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/");
		driver.get("https://www.orangehrm.com/30-day-free-trial/");

		//By footerLocator = By.xpath("//footer//a");
		By footerLocator = By.xpath("//div[@class='footer-main']//ul/li");

//		List <WebElement> footerList = driver.findElements(footerLocator);
//		System.out.println(footerList.size());
//		for(WebElement e: footerList) {
//			String linkText = e.getText();
//			
//			System.out.println(linkText);
//		}
		getFooterlinks(footerLocator);
//		

	}

	public static void getFooterlinks(By locator) {
		List<WebElement> footerList = driver.findElements(locator);
		System.out.println(footerList.size());
		for (WebElement e : footerList) {
			String linkText = e.getText();
			System.out.println(linkText);

		}

	}
}
