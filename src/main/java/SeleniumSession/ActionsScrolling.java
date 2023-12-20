package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		Actions act = new Actions(driver);
		
		/// Scrolling is selenium 4.0 feature 
		// this will scroll the page slightly up and down
		
		/*act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		// this will sroll the page completely down and up
		//ctrl or command + arrow key */
		
		/*act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).build().perform();
		*/
		
		
		//Scroll upto specific element and click on it 
		//act.sendKeys(driver.findElement(By.linkText("Help"))).click(driver.findElement(By.linkText("Help"))).build().perform();		
		
		///page refresh with actions
		//Generally we use navigate refresh method.
		
		//driver.navigate().refresh();
		
		//ctrl+f5 keys = both methods exactly doing same action
		act.keyDown(Keys.COMMAND).sendKeys(Keys.F5).keyUp(Keys.COMMAND).build().perform();
		
		
		
		
		
	}

}
