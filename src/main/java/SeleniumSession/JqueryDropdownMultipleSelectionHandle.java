package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JqueryDropdownMultipleSelectionHandle {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");

		// driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		By dropdownLocator = By.xpath("//input[@id='justAnInputBox1' and @class='comboTreeInputBox']");
		By dropdownOptionsLocator = By.xpath(
				"//h3[text()='Multi Selection With Cascade Option Select']/following-sibling::div//span[@class='comboTreeItemTitle']");

		
		selectMultipleDropdownOptions(dropdownLocator, dropdownOptionsLocator, "choice 2 1", "choice 2 3");
//
//		List<WebElement> multiSelOptionList = driver.findElements(By.xpath(
//				"//h3[text()='Multi Selection With Cascade Option Select']/following-sibling::div//span[@class='comboTreeItemTitle']"));
//		System.out.println(multiSelOptionList.size());
//		for (WebElement e : multiSelOptionList) {
//			String text = e.getText();
//			System.out.println(text);
//			if (text.equals("choice 2")) {
//				e.click();
//				break;
//			}
//		}

	}

	public static void selectMultipleDropdownOptions(By locator, By optionsLocator, String... Values) {
		//Select select = new Select(driver.findElement(locator));
		driver.findElement(locator).click();
			if (Values[0].equalsIgnoreCase("all")) {
				List<WebElement> multiSelOptionList = driver.findElements(optionsLocator);
				for (WebElement e : multiSelOptionList) {
					e.click();
				}
			} 
			//else {
				//for (String value : Values) {
				//	value.equals(Value;
					
				}
			
		
	
	public static boolean dropdownIsMultiple(By locator) {
		WebElement ele = driver.findElement(locator);
		Select select = new Select(ele);
		if(select.isMultiple()) {
			return true;
		}else {
			return false;
		}
	
	}
}
