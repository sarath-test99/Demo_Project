package functionalityTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework.BaseTestClass;
import pages.LoginPage;

public class Login_Functionality_Test extends BaseTestClass{
	
	@DataProvider(name = "loanmanagementcredentials")
	public Object [][] method(){
		
		
		
		return new Object [][] {{"admin","admin"}};
		
		
	}
	
	@Test(retryAnalyzer = listeners.RetryAnalyzer.class, dataProvider = "loanmanagementcredentials")
	public static void Enter_Credentials_And_LoginTo_Application(String username,String password) throws Exception {
		
		LoginPage.loginToApplication(username,password);
		
	}
	
	
	@Test
	public static void second_Test() throws Exception {
		
		System.out.println("THis is my second tests");
		
	}
	

}
