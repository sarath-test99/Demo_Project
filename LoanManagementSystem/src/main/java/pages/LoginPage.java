package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import framework.BaseTestClass;

public class LoginPage extends BaseTestClass{
	
	
	@FindBy(name="username") public static WebElement UserName;
	@FindBy(name="pass") public static WebElement Password;
	@FindBy(xpath ="/html/body/div[1]/div[2]/form/div[3]/button") public static WebElement signInButton;
	
	@FindBy(xpath ="/html/body/div[1]/div[2]/form/div[5]") public static WebElement ErrorMEssage;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public static void loginToApplication(String username, String password) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		Thread.sleep(2000);
		UserName.click();
		UserName.clear();
		UserName.sendKeys(username);
		Thread.sleep(2000);
		Password.click();
		Password.clear();
		Password.sendKeys(password);
		signInButton.click();
		Thread.sleep(5000);
		System.out.println(getPageTitle());

		}
	}
	
	

	
	

