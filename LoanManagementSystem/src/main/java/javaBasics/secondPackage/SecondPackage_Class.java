package javaBasics.secondPackage;

import javaBasics.newPacakage.*;

public class SecondPackage_Class {
	
	public static void main(String args[]) {
		
		FirstClass fc = new FirstClass();
		
		Addition add = new Addition();
		
		SecondClass obj = new SecondClass();
		
		obj.firstmethod(); // we can call this method as it is a public method
		
		
	//	SecondClass.secondmethod(); // we can not call this method as it is static 
		
	//	SecondClass.thirdmethod(); // we can not call this method as it is private static 
		
	//	SecondClass.fourthmethod(); // we can not call protected  method 
		
	//	obj.fifthmethod();
		
	//	obj.sixthmethod();
		
	}

}
