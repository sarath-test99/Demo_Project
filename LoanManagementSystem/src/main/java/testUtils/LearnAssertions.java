package testUtils;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LearnAssertions {
	
	
	
	//@Test
	public static void compareToStringValues() throws Exception {
		
		
		String str1 = "quality";
		
		String str2 = "thought";
		
		
		if(str1.equalsIgnoreCase(str2)) {
			
			
			System.out.println("Two strings are matched");
		}else {
			
			System.out.println("Two strings did not match");
			
			throw new Exception("Strings Did not match");
		}
		
		
	}
	
	@Test
	public static void compareToOtherStringValues() {
		
		String str1 = "quality";
		
		String str2 = "thought";
		
		
		// Assert.assertEquals(ActualText,ExpectedText,"Message");
		
	//	Assert.assertEquals(str1,str2);
		
		Assert.assertEquals(str1,str2,"Two strings matching");
		
		
	}
	
	

}
