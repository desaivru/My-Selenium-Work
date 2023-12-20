package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {
	
	static WebDriver driver;

	public static void main(String[] args) {

		//Explicitly wait : is is a dynamic wait for specific we element and non web element
		//it wait based on some condition
		//Wait(Interface) <--FluentWait class until method +other methods <--webdriverwait class
		
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email = By.id("input-email");
		By password = By.id("input-password");
		By login = By.xpath("//input[@value='Login']");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement email_ele= wait.until(ExpectedConditions.presenceOfElementLocated(email)); //here we get WebElement so we can perform further action
		email_ele.sendKeys("desai.vrush@gmail.com");
		
		//no wait required for password and login btn
		driver.findElement(password).sendKeys("123");
		driver.findElement(login).click();
		
		//if the element is found within 3sec then another 7 sec will be ignored.
		//if ele not found with 10sec then after that it will throw TimeOutException + NoScuhElement exception
		
			
	}
	
	//Interview question -: diff between presence of element and visibility of element
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page. 
	 * This does not necessarily mean that the element is visible.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	
	public static WebElement waitForPresenceOfElement(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page and visible.
	 * Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	
	public static WebElement waitForVisisbilityOfElement(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static void doClickWithWait(By locator, int timeOut) {
		waitForVisisbilityOfElement(locator, timeOut).click();
	}
	
	public static void doSendKeysWithWait(By locator, String value, int timeOut) {
		waitForVisisbilityOfElement(locator, timeOut).sendKeys(value);
	}

	
	

}
