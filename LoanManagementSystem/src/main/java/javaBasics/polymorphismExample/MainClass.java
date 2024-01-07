package javaBasics.polymorphismExample;


public class MainClass {
	
	
	public static void main(String args[]) {
		
		
		Vegetables veg = new Vegetables(); // This is from super class
	//	veg.Potato();
		veg.tomato();
		
		Vegetables vegpotato = new Potato(); // THis is from subclass potato
		
	//	vegpotato.Potato();
	//	vegpotato.Tomato();
		
		
		Vegetables vegtoamto = new Tomato();
		
		vegtoamto.tomato();
		
	}

}
