package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		//Action class -> User actions ->> Keyboard and Mouse 
		
		driver = new ChromeDriver();
		
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		
		
		//Actions act = new Actions(driver);
		
		By parentMenuLocator = By.cssSelector("a.menulink");
		By childMenuLocator = By.linkText("COURSES");
		
		//WebElement parentMenuEle = driver.findElement(parentMenu);
		
//		act.moveToElement(parentMenuEle).build().perform();
//		Thread.sleep(2000);
//		
//		//driver.findElement(By.linkText("COURSES")).click();
//		
//		driver.findElement(By.xpath("//a[text()='Single Videos']")).click();
//		
//				
		twoLevelMenuHandle(parentMenuLocator, childMenuLocator);
		
		
	}
	
	public static void twoLevelMenuHandle(By locatorParent, By locatorChild) throws InterruptedException {
		
		Actions act = new Actions(driver);
		WebElement locatParentEle = driver.findElement(locatorParent);
		act.moveToElement(locatParentEle).build().perform();
		Thread.sleep(1000);
		driver.findElement(locatorChild).click();
	
		
	}
}
