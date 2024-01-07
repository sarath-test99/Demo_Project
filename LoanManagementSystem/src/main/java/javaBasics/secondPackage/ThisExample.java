package javaBasics.secondPackage;

public class ThisExample {
	
	private int x ;
	
	public ThisExample(int x) {
		
		x = x;  
		
		
	}
	
	public static void main(String args[]) {
		
		ThisExample obj = new ThisExample(100);
		
		System.out.println(obj.x);
		
	}
	

}
