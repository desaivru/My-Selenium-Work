package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLangLink {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		String url = "https://www.google.com/";

		driver = new ChromeDriver();
		driver.get(url);

		By langOption = By.xpath("//div[@id='SIvCob']/a");
		doClickOnElement(langOption, "मराठी");
//		
		By searchLocator = By.name("q");
		By searchOption = By.xpath("//div[@class='OBMEnb']//ul//li");
		//search(searchLocator, searchOption, "selenium", "selenium interview questions");
	}

	public static void doClickOnElement(By locator, String elementText) {
		List<WebElement> langlist = driver.findElements(locator);
		// System.out.println(langlist.size());
		for (WebElement e : langlist) {
			String text = e.getText();
			// System.out.println(text);
			if (text.equals(elementText)) {
				e.click();
			}
		}

	}

	public static void search(By searchLocator, By searchOption, String searchKey, String suggSearch)
			throws InterruptedException {
		driver.findElement(searchLocator).sendKeys(searchKey);

		Thread.sleep(2000);
		List<WebElement> suggList = driver.findElements(searchOption);
		System.out.println(suggList.size());

		for (WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(suggSearch)) {
				e.click();
				break;
			}
		}
	}
}