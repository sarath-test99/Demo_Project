
package seleniumBasics.basePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	
	
	
public static WebDriver driver;
	
	public static void main(String args[]) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	
		WebElement frame = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		Actions actions = new Actions (driver);
	
		WebElement src = driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
		
		WebElement dest = driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
		
		actions.dragAndDrop(src, dest).perform();
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement clickandhold = driver.findElement(By.xpath("//a[normalize-space()='Resizable']"));
		
		
		actions.moveToElement(clickandhold).clickAndHold().release().perform();
		
		Thread.sleep(4000);
	//	actions.release(clickandhold);
		
		actions.scrollToElement(driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[3]/ul/li[1]/a"))).perform();
		
		
	
	
	
	
	}

}
