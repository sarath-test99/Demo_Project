package seleniumBasics.basePackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {
	
	
	public static void main(String args[]) throws Exception {
		
		
		WebDriver driver = new ChromeDriver();

		 driver.get("https://www.orangehrm.com/");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       
 		
         
         WebElement solutions = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a"));
         WebElement culture = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/div/div/div/div/ul/li[3]"));
         WebElement third = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/div/div/div/div/ul/li[4]/div/div/h6[2]"));
         
         Actions actions = new Actions(driver);
         Thread.sleep(3000);
         actions
         .moveToElement(solutions)
         .moveToElement(culture)
         .moveToElement( third)
         .click()
    
         .perform();
	}

}
