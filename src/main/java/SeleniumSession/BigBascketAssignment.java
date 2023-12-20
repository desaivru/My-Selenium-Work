package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBascketAssignment {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.bigbasket.com/");
		By parentMenu = By.xpath("(//span[text()='Category'])[2]");
		By firstMenu = By.xpath("(//div[@role='menu'])[2]//ul[1]/li/a");
		By secondSubMenu = By.xpath("(//div[@class='relative h-full']/div//ul/following-sibling::ul)[3]/li");
		By thirdSubMenu = By.xpath("(//div[@class='relative h-full']/div//ul/following-sibling::ul)[4]/li");

		driver.findElement(parentMenu).click();
		List<WebElement> optionList = driver.findElements(firstMenu);
		System.out.println(optionList.size());
		for (WebElement e : optionList) {
			String text = e.getText();
			System.out.println(text);
		}
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(secondSubMenu)).build().perform();
		Thread.sleep(3000);
		List<WebElement> optionList1 = driver.findElements(secondSubMenu);
		System.out.println(optionList1.size());
		for (WebElement e : optionList1) {
			String text1 = e.getText();
			System.out.println(text1);
		}
		act.moveToElement(driver.findElement(thirdSubMenu)).build().perform();
		Thread.sleep(2000);
		List<WebElement> optionList2 = driver.findElements(thirdSubMenu);
		System.out.println(optionList2.size());
		for (WebElement e : optionList2) {
			String text2 = e.getText();
			System.out.println(text2);
		}
	}
}
