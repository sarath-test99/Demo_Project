package testUtils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginClass {
	
	
	
	//@Test(dataProvider = "credentials", dataProviderClass = loginDataProvider.class)
	public static void loginToApplication(String username,String password) {
		
		
		System.out.println("my username is " +username);
		
		System.out.println("my password is " +password);
	
	
	}
	
	
	
	//@Test(dataProvider = "numbers")
	public static void add(int a, int b) {
		
		
		int c = a+b;
		
		System.out.println("Sum of two numbers is " +c);
	}
	
	@DataProvider(name = "numbers")
	public Object[][] somemethod(){
		
		
		
		return new Object[][] {{5,10},{20,30}} ;
		
		
	}
	
	@Test(dataProvider = "dell")
	public static void mymethod(String parameter,int second) {
		
		
		System.out.println(parameter);
		System.out.println(second);
		
	}
	
	
	@DataProvider(name = "dell")
	public Object [][] method(){
		
		
		
		return new Object [][] {{"quality",12346}};
		
		
	}
	
	
	

}
