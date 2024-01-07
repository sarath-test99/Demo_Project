package javaBasics.secondPackage;

public class ConstructorNoParameters {
	
	int x ;
	String fname;
	
	public ConstructorNoParameters() {
		
		x = 20;
		fname = "DELL";
		
		
	}
	
	
	public static void main(String args[]) {
		
		ConstructorNoParameters obj = new ConstructorNoParameters();
		
		int number = obj.x;
		
		String name = obj.fname;
		
		System.out.println("Iam printing the number  " +number);
		System.out.println("Iam pringint the string " +name);
		
		
	}

}
