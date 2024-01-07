package seleniumBasics.basePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameExample {
	
	
	public static void main(String args[]) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(5000);
		
		// USing INdex
		//driver.switchTo().frame(1);
		
		// using ID name
	//	driver.switchTo().frame("singleframe");
		
		// WebElement frameelement
		
		int framescount = driver.findElements(By.tagName("iframe")).size();
		
		System.out.println("Total frame count is " +framescount);
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		
		driver.switchTo().frame(frame);
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium");
		Thread.sleep(2000);
		
		// TO come back to default page we use below commands "parentFrame();" or "defaultContent();"
		
		//driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
	
		WebElement frame1 = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		
		driver.switchTo().frame(frame1);
		
		Thread.sleep(2000);
		
		WebElement demoframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		
		
		driver.switchTo().frame(demoframe);
		
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Hello World!!!");
		
		
	}

}
