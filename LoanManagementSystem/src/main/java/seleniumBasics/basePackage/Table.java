package seleniumBasics.basePackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	
	public static WebDriver driver;
	public static void main(String args[]) {
		
		driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		table("29");

		
	}
	
	public static void table(String Age ) {
		
		List<WebElement> tablerow = driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr"));
		int rowcount = tablerow.size();
		List<WebElement> tablecol = driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]/td"));
		int colcount = tablecol.size();
		
		for(int i = 1;i<=tablerow.size();i++) {
			
			for(int j=1;j<=tablecol.size();j++) {
				
				WebElement Allvalues = driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr["+i+"]/td["+j+"]"));
				Allvalues.getText();
			//	System.out.println(Allvalues.getText());
				/*
				 * if(Allvalues.getText().equalsIgnoreCase(Name)) {
				 * 
				 * WebElement Age =
				 * driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr["+i+"]/td[2]"));
				 * 
				 * WebElement Place =
				 * driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr["+i+"]/td[3]"));
				 * 
				 * // System.out.println( Name +" Age is " +Age.getText().toString()
				 * +" Place is " +Place.getText().toString());
				 * 
				 * 
				 * }
				 */
				
				if(Allvalues.getText().equalsIgnoreCase(Age)) {
					
					WebElement Names = driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr["+i+"]/td[1]"));

					WebElement Place = driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr["+i+"]/td[3]"));

					System.out.println( Age +" Name is " +Names.getText().toString() +" Place is " +Place.getText().toString());
				
				
				}
			}

		}

	}

}
