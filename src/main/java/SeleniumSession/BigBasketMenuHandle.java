package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMenuHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/");
		
		By parentMenu = By.xpath("(//span[text()='Category'])[2]");
		By beveragesChildMenu = By.linkText("Beverages");
		By teaChildMenu = By.linkText("Tea");
		By greenTeaChildMenu = By.linkText("Green Tea");
		
		By snacksChildMenu = By.linkText("Snacks & Branded Foods");
		By mithaiChildMenu = By.linkText("Indian Mithai");
		By freshSweetChildMenu = By.linkText("Fresh Sweets");
		
		multiMenuHandle(parentMenu, snacksChildMenu, mithaiChildMenu, freshSweetChildMenu);
		
//		Actions act = new Actions(driver);
//				
//		driver.findElement(parentMenu).click();
//		Thread.sleep(1000);
//		
//		act.moveToElement(driver.findElement(beveragesChildMenu)).build().perform();
//		Thread.sleep(1000);
//		
//		act.moveToElement(driver.findElement(teaChildMenu)).build().perform();
//		Thread.sleep(1000);
//		
//		driver.findElement(greenTeaChildMenu).click();
//		Thread.sleep(7000);
//		
//		WebElement resultText = driver.findElement(By.xpath("//div[@class='hidden']/following-sibling::div/h2"));
//		String text = resultText.getText();
//		System.out.println(text);

		

	}
	
	
	public static void multiMenuHandle(By parentMenuLocator, By firstChildMenuLocator, By secondChildMenuLocator, By fourthChildMenuLocator) throws InterruptedException {
		Actions act = new Actions(driver);
		driver.findElement(parentMenuLocator).click();
		Thread.sleep(1000);
		
		act.moveToElement(driver.findElement(firstChildMenuLocator)).build().perform();
		Thread.sleep(1000);
		
		act.moveToElement(driver.findElement(secondChildMenuLocator)).build().perform();
		Thread.sleep(1000);
		
		driver.findElement(fourthChildMenuLocator).click();
		
		
	}

}
