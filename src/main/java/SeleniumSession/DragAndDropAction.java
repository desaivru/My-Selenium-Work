package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/cl/beverages/?nc=nb");
		
		
		//By srcDrag = By.id("draggable");
		//By targetDrop = By.id("droppable");
		
		//WebElement draggableSrc = driver.findElement(By.id("draggable"));
		//WebElement droppableTarget = driver.findElement(By.id("droppable"));
		
		WebElement parentMenu = driver.findElement(By.xpath("(//span[text()='Category'])[1]"));
		WebElement subMenuOne = driver.findElement(By.xpath("(//div[@role='menu']//ul//a[text()='Beverages'])[1]"));
		
		Actions act = new Actions(driver);
		
//		act
//			.clickAndHold(draggableSrc)
//				.moveToElement(droppableTarget)
//					.release()
//						.build()
//							.perform();
//		
		
		//act.dragAndDrop(draggableSrc, droppableTarget).build().perform();
		
		
		}
	
	
	
	
}
