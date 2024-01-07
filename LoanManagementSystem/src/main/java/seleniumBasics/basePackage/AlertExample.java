package seleniumBasics.basePackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {

		

		WebDriver driver = new ChromeDriver();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator <String>it = handles.iterator();
		
		String parentid = it.next();
		String childid =  it.next();
		
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a")).click();

	
	}
}






//// It will return the parent window name as a String
//String parent = driver.getWindowHandle();
//
//Set<String> s = driver.getWindowHandles();
//
//// Now iterate using Iterator
//Iterator<String> I1 = s.iterator();
//
//while (I1.hasNext()) {
//
//	String child_window = I1.next();
//
//	if (!parent.equals(child_window)) {
//		driver.switchTo().window(child_window);
//
//		System.out.println(driver.switchTo().window(child_window).getTitle());
//
//	//	driver.close();
//	//	driver.quit();
//
//	}
//}