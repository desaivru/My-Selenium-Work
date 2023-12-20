package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	static WebDriver driver;

	public static void main(String[] args) {
		// Context click == right click
		// in some cases we have to right click on button or menu

		driver = new ChromeDriver();

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		By rightClickContextEle = By.cssSelector("span.context-menu-one");

//		WebElement rightClickEle = driver.findElement(By.cssSelector("span.context-menu-one"));
//
//		Actions act = new Actions(driver);
//		act.contextClick(rightClickEle).build().perform();
//
//		List<WebElement> optionList = driver.findElements(By.cssSelector("li.context-menu-icon>span"));
//		System.out.println(optionList.size());
//		for (WebElement e : optionList) {
//			String text = e.getText();
//			System.out.println(text);
//			if (text.equals("Copy")) {
//				e.click();
//				break;
//			}
//		}
//

		contextClickMenuSelect(rightClickContextEle, "Copy");
	}

	
	///Generic method to select Context click menu
	public static void contextClickMenuSelect(By locator, String suggOption) {
		WebElement rightClickEle = driver.findElement(locator);
		Actions act = new Actions(driver);
		act.contextClick(rightClickEle).build().perform();

		List<WebElement> optionList = driver.findElements(By.cssSelector("li.context-menu-icon>span"));
		System.out.println(optionList.size());
		for (WebElement e : optionList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(suggOption)) {
				e.click();
				break;
			}
		}

	}

}
