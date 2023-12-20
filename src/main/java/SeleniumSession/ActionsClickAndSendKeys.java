package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickAndSendKeys {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		Actions act = new Actions(driver);

		act.sendKeys(driver.findElement(By.id("input-email")), "desai.vrush@gmail.com").build().perform();
		act.sendKeys(driver.findElement(By.id("input-password")), "ab123").perform();
		act.click(driver.findElement(By.xpath("//input[@type='submit']"))).perform();

	}

	public static void doActionsSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(driver.findElement(locator), value).build().perform();

	}

	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(driver.findElement(locator)).perform();
	}
}
