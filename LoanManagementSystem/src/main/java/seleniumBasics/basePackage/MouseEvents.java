package seleniumBasics.basePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents {
	
	
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
		
		Thread.sleep(3000);
		
		WebElement enterdata = driver.findElement(By.xpath(".//*[@id=\"BlogSearch1_form\"]/form/table/tbody/tr/td[1]/input"));
		actions.sendKeys(enterdata, "selenium");
		WebElement search = driver.findElement(By.xpath(".//*[@id=\"BlogSearch1_form\"]/form/table/tbody/tr/td[2]/input"));
		
		actions.click(search).perform();
		
		Thread.sleep(3000);
		
		WebElement home = driver.findElement(By.xpath("//*[@id='home']"));
		
		
		actions.contextClick(home).perform();
		
		
		
	}

}
