package framework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages.LoginPage;

public class BaseTestClass {

	public static WebDriver driver;

//	public static 

	@BeforeTest
	public void launchBrowser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qtinternship.com/projects/loan/v1/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		LoginPage loginPage = new LoginPage(driver);
		
	}

	@AfterTest
	public static void closeBrowser() {

		driver.close();

	}

	public static void clickOnAElement(WebElement element) {

		element.click();

	}

	public static void sendInputText(WebElement element, String value) {

		element.click();
		element.clear();
		element.sendKeys(value);
		element.clear();

	}
	
	public static String  getPageTitle() {
        return driver.getTitle();
    }
	
}
