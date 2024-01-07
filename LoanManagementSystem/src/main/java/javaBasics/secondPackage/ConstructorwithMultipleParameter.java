package javaBasics.secondPackage;

public class ConstructorwithMultipleParameter {
	
	int x;
	String fname ;
	
	public ConstructorwithMultipleParameter(int y , String name) {
		
		x = y;
		
		fname = name;
		
	}
	
	
	public static void main(String args[]) {
		
		ConstructorwithMultipleParameter obj = new ConstructorwithMultipleParameter(200,"DELL");
		
		int d = obj.x;
		String sname = obj.fname;
		
		System.out.println("I am printing number " +d);
		
		System.out.println("Iam printing string " +sname);
		
		
		
	}

}
