package javaBasics.secondPackage;

public class ConstructorwithParameters {
	
	
	int x;
	
	public ConstructorwithParameters(int y) {
		
		x =y;
		
	}
	
	public static void main(String args[]) {
		
		ConstructorwithParameters obj = new ConstructorwithParameters(100);
		
		int z = obj.x;
		
		System.out.println("Iam printing number z " +z);
		
	}
	

}
