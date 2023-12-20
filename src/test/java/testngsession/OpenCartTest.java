package testngsession;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartTest {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	
	@Test(priority = 2)
	public void isLogoVisibleTest() {
		boolean flag = driver.findElement(By.xpath("//img[@title='naveenopencart']")).isDisplayed();
		Assert.assertEquals(flag, true);
		
	}
	
	@Test(priority = 3)
	public void openCartTitleTest() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, "Account Login");
		
	}
	
	@Test(priority = 1)
	public void openCartURLTest() {
		String currentURL = driver.getCurrentUrl();
		Assert.assertTrue(currentURL.contains("opencart"));
	}
	
	@Test()
	public void atest() {
		System.out.println("atest");
	}

	@Test()
	public void best() {
		System.out.println("btest");

	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
