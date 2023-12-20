package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.handler.timeout.TimeoutException;

public class WaitForTitleUrl {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By aboutUsLink = By.linkText("About Us");

		driver.findElement(aboutUsLink).click();

		// For title verification always use WebDriver wait it will surely work.

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		if (wait.until(ExpectedConditions.titleContains("About"))) {
			System.out.println(driver.getTitle());
		} else {
			System.out.println("title is not present");
		}

	}

	public static String waitForTitleContains(String fractionValue, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if (wait.until(ExpectedConditions.titleContains(fractionValue))) {
				return (driver.getTitle());
			}
		} catch (TimeoutException e) {
			System.out.println("title is not present");
		}
		return null;

	}
	
	
	public static String waitForUrlContains(String urlFractionValue, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if (wait.until(ExpectedConditions.titleContains(urlFractionValue))) {
				return (driver.getTitle());
			}
		} catch (TimeoutException e) {
			System.out.println("URL Fraction Value is not present");
		}
		return null;

	}
	
	public static String waitForUrlToBe(String urlToBe, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if (wait.until(ExpectedConditions.urlToBe(urlToBe))) {
				return (driver.getCurrentUrl());
			}
		} catch (TimeoutException e) {
			System.out.println("URL Value is not present");
		}
		return null;

	}



}
