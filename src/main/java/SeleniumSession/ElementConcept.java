package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementConcept {
	
 static WebDriver driver;
 
	public static void main(String[] args) throws InterruptedException {

		//webelement:
		//create the webelement + perform an action(click, sendKeys, getText, isDisplayed)
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		Thread.sleep(15000);
		
//		//1 - this approach is only for basic learning and not used in any real type of project 
//		driver.findElement(By.id("input-email")).sendKeys("vrush@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("123@jan");
		
		
//		//2 - storing locators in webelement reference and then performing action on it.
//		// we can use webelement reference anywhere in the code.dont need to write it again and again
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		emailId.sendKeys("vrush@gmail.com");
//		password.sendKeys("123@jan");
		
//		//3 By locator
//		By emailId = By.id("input-email");
//		By password = By.id("123@jan");
//		
//		WebElement eID = driver.findElement(emailId);
//		WebElement pwd = driver.findElement(password);
//		
//		eID.sendKeys("vrush@gmail.com");
//		pwd.sendKeys("123@jan");

		
//		//4 By locator + generic method
//		By emailId = By.id("input-email");
//		By password = By.id("123@jan");
//		
//		getElement(emailId).sendKeys("vrush@gmail.com");
//		getElement(password).sendKeys("123@jan");
		
		
//		//5 By locator + generic method for element and action
//		By emailId = By.id("input-email");
//		By password = By.id("123@jan");
//		
//		doSendKeys(emailId, "vrush@gmail.com");
//		doSendKeys(password, "123@jan");
		
		//6 By locator + generic method for elementand action in another class(element util)
////		By emailId = By.id("input-email");
////		By password = By.id("input-password");		
////		
//		ElementUtil eUtil = new ElementUtil(driver);
//		eUtil.doSendKeys(emailId, "vrush@gmail.com");
//		eUtil.doSendKeys(password, "123@jan");
		
		// 7 
		ElementUtil eUtil = new ElementUtil(driver);
		eUtil.doSendKeys("id", "input-email", "vrush@gmail.com");
		eUtil.doSendKeys("id", "input-password", "123@jan");
		
		
		// 7 BrowserUtil + ElementUtil
		
		// 8 by locator----->String locator
		
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
		
	}

}
