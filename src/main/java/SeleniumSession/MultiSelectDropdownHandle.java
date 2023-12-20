package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdownHandle {
	static WebDriver driver;

	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
		
		
		
//		Select select = new Select(driver.findElement(By.xpath("//select")));
//		
//		if(select.isMultiple()) {
//			System.out.println("Yes it is multiple selection");
//			select.selectByVisibleText("Andean flamingo");
//			select.selectByVisibleText("American flamingo");
//			select.selectByVisibleText("Greater flamingo");
//		
//		}
		
		By dropDownlocator = By.xpath("//select");
		By dropDownOptions = By.xpath("//select/option");
		
		
		selectDropdownMultipleValues(dropDownlocator, dropDownOptions, "All");
	}
	
	
	
	public static void selectDropdownMultipleValues(By locator, By optionLocator, String... values) {
		Select select = new Select(driver.findElement(locator));
		if(dropdownIsMultiple(locator)) {
			if(values[0].equalsIgnoreCase("all")) {
				List<WebElement> optionList = driver.findElements(optionLocator);
				for(WebElement e: optionList) {
					e.click();
				}
				
			}else {
				for(String value:values) {
					select.selectByVisibleText(value);
				}
			}
		}
		
		
		
	}
	
	public static boolean dropdownIsMultiple(By locator) {
		WebElement ele = driver.findElement(locator);
		Select select = new Select(ele);
		if(select.isMultiple()) {
			return true;
		}else {
			return false;
		}
		
		
		//select.isMultiple()? true:false;
	}
	
	////h3[text()='Multi Selection With Cascade Option Select']/following-sibling::div//span[@class='comboTreeItemTitle']

	
	
	
}
