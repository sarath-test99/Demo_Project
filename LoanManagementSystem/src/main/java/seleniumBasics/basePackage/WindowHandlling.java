package seleniumBasics.basePackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlling {

	public static void main(String args[]) throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Windows.html");

		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		System.out.println("My page is" + driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		
		Thread.sleep(2000);
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> ithandle = handles.iterator();
		
		String Parentwindow = ithandle.next();
		
		while(ithandle.hasNext()) {
		
		String Childwindow = ithandle.next();
		
		if(!Parentwindow.equalsIgnoreCase(Childwindow)) {
	
		driver.switchTo().window(Childwindow);
		
		System.out.println( driver.getTitle());
		
		Thread.sleep(3000);
		}
		
		else {
			
			System.out.println("driver did not switch");
		}
		
			
		}
		
		driver.switchTo().window(Parentwindow);
		
		System.out.println( driver.getTitle());
	
	
	}
		
		
		
	}


