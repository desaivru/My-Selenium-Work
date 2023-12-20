package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImageAmazon {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		String url = "https://www.amazon.in/";
		driver = new ChromeDriver();

		driver.get(url);
		
		By tagName = By.tagName("img");
		totalImageLink(tagName, "alt", "src");
		
//		List <WebElement> imgList= driver.findElements(By.tagName("img"));
//		System.out.println(imgList.size());
//		
//		for(WebElement e: imgList) {
//			//String altValue = e.getAttribute("alt");
//			String srcValue = e.getAttribute("src");
//			//System.out.println(altValue+"==="+srcValue);
//			System.out.println(srcValue);
		}
//		

	
	public static void totalImageLink(By tagNameLocator, String attriName, String attriLink) {
		List <WebElement> imgList= driver.findElements(tagNameLocator);
		System.out.println(imgList.size());
		
		for(WebElement e: imgList) {
			String altValue = e.getAttribute(attriName);
			String srcValue = e.getAttribute(attriLink);
			System.out.println(altValue+ "===" +srcValue);
			
		}
	}
}
		
		
	

	
	
