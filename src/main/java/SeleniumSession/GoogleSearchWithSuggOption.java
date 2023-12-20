package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchWithSuggOption {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		By searchTextlocator = By.xpath("//textarea[@name='q']");
		
		By searchOption = By.xpath("//div[@class='OBMEnb']//ul//li");
		
		search(searchTextlocator, searchOption, "bracelate", "bracelet for women");
		
	}
		
		public static void search(By searchLocator, By searchOption, String searchKey, String suggSearch)
				throws InterruptedException {
			driver.findElement(searchLocator).sendKeys(searchKey);

			Thread.sleep(2000);
			List<WebElement> suggList = driver.findElements(searchOption);
			//System.out.println(suggList.size());

			for (WebElement e : suggList) {
				String text = e.getText();
				//System.out.println(text);
				if (text.equals(suggSearch)) {
					e.click();
					break;
				}
			}
		}
}
		

	


