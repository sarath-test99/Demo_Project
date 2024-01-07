package seleniumBasics.basePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {
	
	
	public static void main(String args[]) {
		
		WebDriver driver = new ChromeDriver();
		
		String URLName = "https://www.google.com/";
		
		driver.get(URLName);
		
		driver.manage().window().maximize();
		
		// USing Type value xpath
		
	//	WebElement inputtextarea = driver.findElement(By.xpath("//textarea[@type='search']"));
		
	//	inputtextarea.sendKeys("Quality thought");
		
		// Using Class Xpath
		
	//	WebElement inputtextarea = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		
	//	inputtextarea.sendKeys("Quality thought");
		
		// tag use # ID css selector 
		
	//	WebElement inputtextarea = driver.findElement(By.cssSelector("textarea#APjFqb"));
		
	//	inputtextarea.sendKeys("Quality");
		
		// tag use . class css selector
		
		WebElement inputarea = driver.findElement(By.cssSelector("textarea.gLFyf"));
		inputarea.sendKeys("thought");
	}

}
