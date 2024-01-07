package testUtils;

import org.testng.annotations.DataProvider;

public class loginDataProvider {
	
	
	
	@DataProvider(name = "credentials")
	public Object [][] dataprovidermethod(){
		
		
		return new Object [][] {{"quality","thought"},{"java","selenium"},{"mobile","laptop"}};
		
	}
	
	
	
	
	

}
