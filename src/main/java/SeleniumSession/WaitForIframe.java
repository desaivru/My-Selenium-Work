package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitForIframe {
	
	static WebDriver driver;

	public static void main(String[] args) {

		driver= new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		By formImg = By.xpath("//div[@id='imageTemplateContainer']");
		By frame = By.xpath("//iframe[contains(@id='frame-one')]");
		
		driver.findElement(formImg).click();
		
	}

}
