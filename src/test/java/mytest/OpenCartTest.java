package mytest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest{
	
//WebDriver driver;
//	
//	@BeforeTest
//	public void setup() {
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		
//	}
	
	
	@Test(priority=1)
	public void amazonTitleTest() {
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, "Account Login");;
	}
	
	@Test(priority=2)
	public void amazonURLTest() {
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		Assert.assertTrue(actualURL.contains("account/login"));
	}
	
//	@AfterTest
//	public void tearDown() {
//		driver.close();
//	}


}
