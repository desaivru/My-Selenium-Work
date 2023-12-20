package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeWork {

	static WebDriver driver;
	public static void main(String[] args) {
		
		String url = "https://naveenautomationlabs.com/opencart/index.php?route=account/register";

		driver = new ChromeDriver();
		driver.get(url);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	
	
	}	

}
