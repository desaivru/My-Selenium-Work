package SeleniumSession;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		//Implicitly wait- Dynamic wait. Its a global wait, once declare it will be applicable for web elements (only for WebElement)
		//It is applied after driver initialization.
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //Selenium 3.x and its deprecated.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //selenium 4.x
		
		//login page 10 sec wait
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.findElement(By.id("input-email")).sendKeys("vrushali"); //it will wait for this element.
		//if element found within 2 sec then another 8 sec will be ignored.
		//if element not found after 1o sec then exception - NoSuchElementException
		
		//again the home page take 20 sec so we can overload the wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//for web element after this line will wait for 20 sec.
		//if we logout and login again the login will take new wait 20 sec.
		
		//if any page required 0 sec wait - we can call it as nullification of implicit wait.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
		//disadvantage
		//email: will wait 10 sec->ele found in 2 sec-> 8 sec will be ignored.
		//once the page is load and email we have wait for 10 sec so no need to wait for other field but still it will be applied.
		//pass: 10 sec -> found in 0 sec-> 10 sec ignored
		//login btn: 10 sec-> found in 2 sec-> 10 sec ignored
		//It can not be used for non webElement eg (alert, url, title)
		
		
	}

}
