package seleniumBasics.basePackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	
	
	public static WebDriver driver;
	public static void main(String args[]) {
	driver = new ChromeDriver();
	driver.get("https://omayo.blogspot.com/");
	driver.manage().window().maximize();
	
	selectmultiple("Pen","Book");
	
	webTable();
	
	}
	
	
	public static void selectmultiple(String box1, String box2) {
		

	List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@id=\"HTML33\"]/div[1]/input"));
	
//	for(WebElement checkbox : checkboxes) {
//		
//		if(checkbox.getAttribute("value").equalsIgnoreCase(box2) ||checkbox.getAttribute("value").equalsIgnoreCase(box1)   ) {
//			
//			if(checkbox.isSelected()) {
//				
//				System.out.println("Already selected");
//				
//			}else {
//				
//				checkbox.click();
//			}
//		}
//	}
	
	for(int i=0;i<checkboxes.size();i++) {
		
		String checkbox = checkboxes.get(i).getAttribute("value");
		
		if(checkbox.equalsIgnoreCase(box1) || checkbox.equalsIgnoreCase(box2)) {
			
			if(checkboxes.get(i).isSelected()) {
				
				System.out.println("Already selected");
			}else {
				
				checkboxes.get(i).click();
			}
		}
	}
	
	
	
}
	
	
	public static void webTable() {
      
	List<WebElement> rows = driver.findElements(By.xpath("//*[@id='table1']/tbody/tr"));
	
	
	for(int i= 1; i<=rows.size() ; i++) 
	{
		List<WebElement> cols = driver.findElements(By.xpath("//*[@id='table1']/tbody/tr["+i+"]/td"));
		
		
		for(int j=1;j<=cols.size();j++) {
			
			WebElement values = driver.findElement(By.xpath("//*[@id='table1']/tbody/tr["+i+"]/td["+j+"]"));
			
			String value = values.getText();
			
			//System.out.print(value);
			
			if(value.equalsIgnoreCase("Dheepthi")) {
				
				WebElement Age = driver.findElement(By.xpath("//*[@id='table1']/tbody/tr["+i+"]/td[2]"));
				
				System.out.println(Age.getText());
				
				WebElement Place = driver.findElement(By.xpath("//*[@id='table1']/tbody/tr["+i+"]/td[3]"));
				System.out.println(Place.getText());
			break;
			}

		}

	}
		
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



