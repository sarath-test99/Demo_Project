package seleniumBasics.basePackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
	
	public static WebDriver driver;
	
	public static void main(String args[]) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//*[@id=\"fromCity\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("Hyderabad");
		
		Thread.sleep(5000);
		List<WebElement> suggestions = driver.findElements(By.xpath(".//*[@role='listbox']/li"));
		
		System.out.println(suggestions.size());
		
		for(int i=1;i<=suggestions.size();i++) {
			
			WebElement option = driver.findElement(By.xpath(".//*[@role='listbox']/li["+i+"]"));
			
			String value = option.getText();
			System.out.println(value);
			if(value.contains("VGA"))
			{
			
			option.click();
			}
		}
		
	}

}
