package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitWithIntervalTime {
	
	static WebDriver driver;

	public static void main(String[] args) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // this is with total timeout 10 second and interval time is 500
    //milisecond which is .5 sec andits default interval. If element not found will give you TimeOutException with 500 time interval 
    //and also NoSuchElementEception
    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10),Duration.ofSeconds(2));
    //This is with interval of 2 second. If ele not found intotal timeout it will give you TimeOutException with 2000 time interval 
    //and also NoSuchElementEception
    
		

	}
	public static WebElement waitForVisisbilityOfElementWithIntervalTime(By locator, int timeOut, int intervalTime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut), Duration.ofSeconds(intervalTime));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}


}
