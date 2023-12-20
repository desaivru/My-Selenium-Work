package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallerClass {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		String browserName = "Chrome";
		String url = "https://naveenautomationlabs.com/opencart/index.php?route=account/register";
		
		BrowserUtils brUtil = new BrowserUtils();
		driver =brUtil.launchBrowser(browserName);
		//brUtil.openBrowser();
		brUtil.launchUrl(url);
		//brUtil.verifyTitle();
		
		
////***********************NaveenAutomation Open cart locators***************************************		
		By firstName = By.xpath("//input[@name = 'firstname']");
		By lastName = By.xpath("//input[@placeholder= 'Last Name']");
		By emailId = By.xpath("//input[@type='email']");
		By telephone = By.xpath("//input[@type='tel']");
		By password = By.xpath("//input[@name='password']");
		By confirmPassword = By.xpath("//input[@name='confirm']");
		By policyAgree= By.xpath("//input[@name='agree']");
		By subButton = By.xpath("//input[@value='Continue']");
		
		ElementUtil eUtil = new ElementUtil(driver);
		eUtil.doSendKeys(firstName, "Vrushali");
		eUtil.doSendKeys(lastName, "Desai");
		eUtil.doSendKeys(emailId, "desai.vrush@gmail.com");
		eUtil.doSendKeys(telephone, "9930865729");
		eUtil.doSendKeys(password, "Jan@123");
		eUtil.doSendKeys(confirmPassword, "Jan@123");
		eUtil.doClick(policyAgree);
		eUtil.doClick(subButton);
		
		
		
		
		
		
		
		
		//brUtil.closeBrowser();
		
		
		
	}
	
	

}
