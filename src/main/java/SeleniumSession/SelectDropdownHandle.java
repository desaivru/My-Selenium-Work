package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownHandle {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");

		By countryDropdown = By.id("Form_getForm_Country");

		// If the select tag is there the we can use select class and create object of
		// select class and provide WebElementas constructor
		// if the values are static then only we have to use Byindex method. e.g. month
		// 1-12
		// if the value attribute is in the dom we can use Byvalue method.
		// mostly preferred in other case ByVisibleText method.
		// WebElement CountryEle = driver.findElement(countryDropdown);

//		Select select = new Select(CountryEle);
//		select.selectByIndex(2);
//				
//		select.selectByVisibleText("Argentina");
//		
//		select.selectByValue("Bangladesh");

//		doSelectDropdownByIndex(countryDropdown, 5);
//		doSelectDropdownByValue(countryDropdown, "India");
//		doSelectDropdownByVisisbleText(countryDropdown, "Belgium");

		getCountAndSelectDropdownValue(countryDropdown, "India");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectDropdownByIndex(By locator, int indexValue) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(indexValue);

	}

	public static void doSelectDropdownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);

	}

	public static void doSelectDropdownByVisisbleText(By locator, String dropDownValue) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(dropDownValue);

	}

	public static int getDropDownOptionsCount(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions().size();

	}

	/// without any select method
	public static void getCountAndSelectDropdownValue(By locator, String dropDownValue) {
		Select select = new Select(getElement(locator));
		List<WebElement> countryList = select.getOptions();
		System.out.println(countryList.size());

		for (WebElement e : countryList) {
			String text = e.getText();
			System.out.println(text);

			if (text.equals(dropDownValue)) {
				e.click();
				break;
			}
		}

	}
}
