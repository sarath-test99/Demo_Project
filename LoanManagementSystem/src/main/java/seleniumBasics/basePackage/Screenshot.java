package seleniumBasics.basePackage;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {
	
	
	public static void main(String args[]) throws Exception {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.selenium.dev/");

		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		TakesScreenshot srnshot = (TakesScreenshot) driver;
		
		// TO take the screenshot use this method getScreenshotAs
		File f = srnshot.getScreenshotAs(OutputType.FILE);
		
		Files.copy(f, new File(System.getProperty("user.dir") +
"/Screenshot/homepage.jpeg"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span")).click();
		Thread.sleep(2000);
		
		File downloadpage = srnshot.getScreenshotAs(OutputType.FILE);
		
		Files.copy(downloadpage, new File(System.getProperty("user.dir") +
				"/Screenshot/downloadpage.jpg"));
		
		// Screenshot of a Webelement or Partial Screenshot
		
		WebElement logo = driver.findElement(By.xpath("/html/body/header/nav/a/span"));
		
	File logopic =	logo.getScreenshotAs(OutputType.FILE);
		
		Files.copy(logopic, new File(System.getProperty("user.dir") +
				"/Screenshot/Logophot.jpeg"));
		
		
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
