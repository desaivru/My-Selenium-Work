package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandleWithoutSelect {
	
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		//driver.findElements(By.xpath("//select[@name='Country']/option"));
		//By countryDropDown = By.xpath("//select[@name='Country']/option");
		By countryDropDown = By.cssSelector("select#Form_getForm_Country > option");

		
		selectDropDownValue(countryDropDown, "India");
		
	}
	
	public static void selectDropDownValue(By locator, String dropdownValue) {
		List<WebElement> optionList = driver.findElements(locator);
		for(WebElement e:optionList) {
			String text = e.getText();
			
			if(text.equals(dropdownValue)) {
				e.click();
				break;
			}
		}
	}

}
