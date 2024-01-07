package seleniumBasics.basePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {
	
	
	
public static WebDriver driver;
	
	public static void main(String args[]) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		Actions actions = new Actions (driver);
		
		WebElement blog = driver.findElement(By.xpath("//*[@id=\"blogsmenu\"]"));
		Thread.sleep(4000);
		actions.moveToElement(blog).perform();
		
		actions.keyDown(Keys.ARROW_DOWN).keyDown(Keys.ARROW_DOWN).perform();
		
		WebElement enterdata = driver.findElement(By.xpath(".//*[@id=\"BlogSearch1_form\"]/form/table/tbody/tr/td[1]/input"));
		
		actions.scrollToElement(enterdata).perform();
		
		actions.keyDown(Keys.SHIFT).sendKeys(enterdata,"selenium").perform();
		
	
		
		
		actions.keyDown(Keys.BACK_SPACE).keyDown(Keys.BACK_SPACE).perform();
		
		actions.doubleClick(enterdata).perform();
		
		WebElement link = driver.findElement(By.xpath("//*[@id=\"LinkList1\"]/div/ul/li[1]"));
//		actions.scrollToElement(link).perform();
//		
//		actions.moveToElement(link).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).perform();
//		
	}
	
}
