package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	public static void main(String[] args) {

		String url = "https://selectorshub.com/xpath-practice-page/";
		WebDriver driver = new ChromeDriver();

		driver.get(url);
		
		driver.findElement(By.xpath("//a[text()='Jasmine.Morgan']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();

		
	}

}
