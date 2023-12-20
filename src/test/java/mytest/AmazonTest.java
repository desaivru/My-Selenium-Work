package mytest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest{
//WebDriver driver;
//	
//	@BeforeTest
//	public void setup() {
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://www.amazon.in/");
//		
//	}
	
	
	@Test(priority = 1)
	public void amazonTitleTest() {
		//driver.get("https://www.amazon.in/");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertTrue(actualTitle.contains("Shopping"));
	}
	
	@Test(priority=2)
	public void amazonURLTest() {
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		Assert.assertTrue(actualURL.contains("amazon"));
	}
	
//	@AfterTest
//	public void tearDown() {
//		driver.close();
//	}


}
