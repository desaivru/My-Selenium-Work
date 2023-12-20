package SeleniumSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RoughWork {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.bigbasket.com/");
		By parentMenu = By.xpath("(//span[text()='Category'])[2]");
		By firstMenu = By.xpath("(//div[@role='menu'])[2]//ul[1]/li/a");
		By secondSubMenu = By.xpath("(//div[@class='relative h-full']/div//ul/following-sibling::ul)[3]/li");
		By thirdSubMenu = By.xpath("(//div[@class='relative h-full']/div//ul/following-sibling::ul)[4]/li");

		driver.findElement(parentMenu).click();

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(firstMenu)).build().perform();

		List<WebElement> optionList = driver.findElements(firstMenu);
		System.out.println(optionList.size());
		act.moveToElement(driver.findElement(secondSubMenu)).build().perform();

		List<WebElement> optionList1 = driver.findElements(secondSubMenu);
		System.out.println(optionList1.size());
		act.moveToElement(driver.findElement(thirdSubMenu)).build().perform();

		List<WebElement> optionList2 = driver.findElements(thirdSubMenu);
		System.out.println(optionList2.size());

//		String[] optionText = new String[optionList.size()];
//		String optionText1[] = new String[optionList1.size()];
//		String optionText2[] = new String[optionList2.size()];
//		//int i = 0;
//		int j = 0;
//		int k = 0;

//		// Storing List elements text into String array
//		for (WebElement a : optionList) {
//			optionText[i] = a.getText();
//
//			for (WebElement b : optionList1) {
//				optionText1[j] = b.getText();
//				j++;
//				// System.out.println(Arrays.toString(optionText1));
//				for (WebElement c : optionList2) {
//					optionText2[k] = c.getText();
//					k++;
//					if (k == optionList2.size()) {
//						System.out.println(Arrays.toString(optionText2));
		}
}

