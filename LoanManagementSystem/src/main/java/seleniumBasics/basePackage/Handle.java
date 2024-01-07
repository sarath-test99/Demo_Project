package seleniumBasics.basePackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle {
	
	public static void main(String args[]) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Windows.html");
	Thread.sleep(5000);
	System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
	
	
	Set<String> handles = driver.getWindowHandles();
	
	Iterator<String> it = handles.iterator();
	
	String parentwindow = driver.getWindowHandle();
	
	while(it.hasNext()) {
		
		String childwindow = it.next();
		
		if(!parentwindow.equals(childwindow)) {
			
			driver.switchTo().window(childwindow);
			
			System.out.println(driver.getTitle());
		}
	}
	
	driver.switchTo().window(parentwindow);
	}
}
