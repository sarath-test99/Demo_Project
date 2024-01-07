package seleniumBasics.basePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollExamples {
	
	
	public static void main(String args[]) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// TO scroll to Botton of the page
	//	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		Thread.sleep(2000);
		// TO scroll to TOp of the page
	//	js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		
		WebElement actionsapilink = driver.findElement(By.xpath("//input[@name='userid']"));
		
		js.executeScript("arguments[0].scrollIntoView(true);",actionsapilink );
		
//		Actions actions = new Actions(driver);
//		actions.moveToElement(actionsapilink);
//		actions.perform();
//		
		Thread.sleep(3000);
		actionsapilink.click();
		
		// Using Scroll by Providing pixel hieght as required
	//	js.executeScript("window.scrollBy(0,1000)");
	//	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", actionsapilink);

	}

}
