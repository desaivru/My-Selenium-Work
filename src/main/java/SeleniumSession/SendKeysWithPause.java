package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysWithPause {

	static WebDriver driver;

	public static void main(String[] args) {
		// Interview question

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		WebElement emailId = driver.findElement(By.id("input-email"));
		Actions act = new Actions(driver);

		String value = "desai.vrush@gmail.com";
		char ar[] = value.toCharArray();

		for (char c : ar) {
			act.sendKeys(emailId, String.valueOf(c)).pause(800).build().perform();
		}

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void sendKeysWithPause(By locator, String value) {
		Actions act = new Actions(driver);

		char ar[] = value.toCharArray();
		for (char c : ar) {
			act.sendKeys(getElement(locator), String.valueOf(c)).pause(800).build().perform();
		}

	}

}
