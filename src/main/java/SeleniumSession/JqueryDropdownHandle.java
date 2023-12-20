package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropdownHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectmenu/");

		driver.switchTo().frame(0);
		Thread.sleep(4000);

		/// Select a speed with css and xpath
//		driver.findElement(By.xpath("//span[@id='speed-button']")).click();
//		//driver.findElement(By.cssSelector("span#speed-button")).click();
//		
//		List<WebElement> optionList = driver.findElements(By.xpath("//ul[@id='speed-menu']//div"));
//		//List<WebElement> optionList = driver.findElements(By.cssSelector("ul#speed-menu div"));
//		
//		System.out.println(optionList.size());
//			
//		for(WebElement e:optionList) {
//			String text = e.getText();
//			System.out.println(text);
//		}
//		
		//// Select Number dropdown
		driver.findElement(By.xpath("//span[@id='number-button']")).click();
		Thread.sleep(2000);

		List<WebElement> optionList = driver.findElements(By.xpath("//ul[@id='number-menu']/li"));
		System.out.println(optionList.size());

		for (WebElement e : optionList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals("10")) {
				e.click();
				break;
			}
		}
	}

}
