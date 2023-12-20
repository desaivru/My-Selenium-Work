package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsTabKeyFunction {

	static WebDriver driver;

	public static void main(String[] args) {
		// You are allowed to use only one webelement or locator
		// and you have to fill the form with 500 milsec time interval in between two
		// field

		driver = new ChromeDriver();
		// driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// Actions act = new Actions(driver);

//		WebElement firstName = driver.findElement(By.id("input-email"));
//		
//		act.sendKeys(firstName, "vrushali")
//		.sendKeys(Keys.TAB)
//		.pause(500)
//		.sendKeys("desai")
//		.sendKeys(Keys.TAB)
//		.pause(500)
//		.build()
//		.perform();
//		

		// ******************************Interview question************************
		driver.get("https://www.amazon.in/");

		Actions act = new Actions(driver);
		Action action = act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
				.sendKeys(Keys.TAB).sendKeys("iphone").sendKeys(Keys.ENTER).build();

		action.perform();
	}

}
