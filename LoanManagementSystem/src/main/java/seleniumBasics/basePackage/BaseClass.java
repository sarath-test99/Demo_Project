package seleniumBasics.basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static void main(String args[]) throws Exception {
		
		System.out.println("Hello Selenium!!!!");
		
	//	WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println("I have opened Google web page");
		
		String mycuurenturl = driver.getCurrentUrl();
		
		System.out.println("My current url "+mycuurenturl);
		
	//	System.out.println("without string" +driver.getCurrentUrl());
		
	//	System.out.println("My page source is " +driver.getPageSource());
		
		System.out.println("My Page titile is" +driver.getTitle());
		
		//driver.manage()
		
		WebDriver.Options options = driver.manage();
		
		options.window().maximize();
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.google.com/search?q=gmail&sca_esv=586179213&source=hp&ei=HcxmZZq-EoighwOtt7iABg&iflsig=AO6bgOgAAAAAZWbaLTWc3Bd_NTo_GpGOT0w-wZ_kACwH&ved=0ahUKEwjawKiAveiCAxUI0GEKHa0bDmAQ4dUDCAo&uact=5&oq=gmail&gs_lp=Egdnd3Mtd2l6IgVnbWFpbDIQEAAYgAQYigUYsQMYgwEYQzILEAAYgAQYsQMYgwEyCxAAGIAEGLEDGIMBMggQABiABBixAzILEAAYgAQYsQMYgwEyCBAAGIAEGLEDMggQABiABBixAzIIEAAYgAQYsQMyCxAAGIAEGLEDGIMBMgUQABiABEitCVAAWJQEcAB4AJABAJgBW6ABoQOqAQE1uAEDyAEA-AEBwgIWEC4YgAQYigUYsQMYgwEYxwEY0QMYQ8ICChAAGIAEGIoFGEPCAgcQABiABBgK&sclient=gws-wiz");
		
		//driver.close();
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		driver.close();
		
		driver.quit();
		
		System.out.println("I have closed the browser");
		
		
		
		
	}

}
