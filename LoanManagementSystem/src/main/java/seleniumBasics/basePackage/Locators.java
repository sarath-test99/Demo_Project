package seleniumBasics.basePackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String args[]) throws Exception{
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		System.out.println("Opened");
		
		driver.manage().window().maximize();
		
		// APjFqb
		
		// Locate Element using ID LOcator
		
	//	WebElement input = driver.findElement(By.id("q"));
		
		// LOcate Element using name Locator
		
	//	WebElement input = driver.findElement(By.name("q"));
		
		// LOcate Element using Class name Locator
		
		WebElement input = driver.findElement(By.className("gLFyf"));
		
		
		input.sendKeys("Quality Thought");
		
		
		Thread.sleep(3000);
		
		
		WebElement PlainArea = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]"));
		
		PlainArea.click();
		
		Thread.sleep(5000);
		
		
		// Count total tags available in the webpage
		
		List<WebElement> allAnchortags = driver.findElements(By.tagName("a"));
		
		List<WebElement> allh3tags = driver.findElements(By.tagName("h3"));
		
		System.out.println("All h3 tag count is "+allh3tags.size());
		System.out.println("All anchor tag count is "+allAnchortags.size());
		
		// Relative X Path
		
	//	WebElement hyderabadlink = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/table/tbody/tr[1]/td/div/div/div/div/h3/a"));
		
	//	hyderabadlink.click();
		
		
		// USing Link TExt
		
	//	WebElement LinktextDevopsTraining = driver.findElement(By.linkText("Devops Training"));
		
	//	LinktextDevopsTraining.click();
		
		// Using Partial Link text
		
		WebElement partiallink = driver.findElement(By.partialLinkText("Online"));
		
		partiallink.click();
		
		Thread.sleep(15000);
		
		
		driver.close();
		
		driver.quit();
		
		
	}
	

}
