package javaBasics.newPacakage;

public class SecondClass {
	
	int x = 20;
	
	static int z = 30;
	
	int y = 10;
	
	public void firstmethod() {
		
		System.out.println("This is firstmethod in new Package and in SecondClass which is Public method");
		
	}
	
	static void secondmethod() {
		
		System.out.println("This is Secondmethod in SecondClass which is a static method");
		
	}
	
	
	private static void thirdmethod() {
		
		System.out.println("This is thirdmethod in SecondClass which is a private static method");
	}
	
	protected static void fourthmethod() {
		
		System.out.println("This is fourthmethod in SecondClass which is a protected static method");
		
	}
	
	protected  void fifthmethod() {
		
		System.out.println("This is fifthmethod in SecondClass which is a only protected method");
		
	}
	
	 void sixthmethod() {
		
		 System.out.println("This is sixthmethod in SecondClass which is a only void method");
	}
	
	
	

}
