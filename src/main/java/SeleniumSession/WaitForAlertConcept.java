package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlertConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver= new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		By alertLocator = By.xpath("//button[text()='Click for JS Alert']");

		// 1 Alert
		driver.findElement(alertLocator).click();
		
		//driver.switchTo().alert().accept(); ///it is not accepting the alert because alert is coming after few second.
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(alert.getText());

		alert.accept();
	}
	
	public static Alert waitForJSAlert(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		return wait.until(ExpectedConditions.alertIsPresent());
		
		}
	
	public static void acceptJSAlert(int timeOut) {
		waitForJSAlert(timeOut).accept();
		
	}
	
	public static void dismissJSAlert(int timeOut) {
		waitForJSAlert(timeOut).dismiss();
	}
	
	public static String getTextOfJSAlert(int timeOut) {
		return waitForJSAlert(timeOut).getText();
	}
	
	public static void enterValueOnJSAlert(String value, int timeOut) {
		waitForJSAlert(timeOut).sendKeys(value);
	}

}
