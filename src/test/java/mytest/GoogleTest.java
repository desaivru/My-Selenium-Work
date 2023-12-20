package mytest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{
	
	//Removing the common and repeatable code and putting it into BaseTest
	
//	WebDriver driver;
//	
//	@BeforeTest
//	public void setup() {
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://www.google.com/");
//		
//	}
	
	
	///We will create testrunner non java folder under that will will create testng.xml runner file which will help us to
	//run test blocks in cross browsers and also we can provide parameter and remove hardcoded values like url
	//will have to creates parameters in base class.
	
	@Test(priority = 1)
	public void googleTitleTest() {
		//driver.get("https://www.google.com/"); //remove this hard coded value --
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, "Google");
	}
	
	@Test(priority = 2)
	public void googleURLTest() {
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		Assert.assertTrue(actualURL.contains("google"));
	}
	
//	@AfterTest
//	public void tearDown() {
//		driver.close();
//	}

}
