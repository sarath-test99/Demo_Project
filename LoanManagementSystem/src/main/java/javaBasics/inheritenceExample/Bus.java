package javaBasics.inheritenceExample;

public class Bus extends Vehicle  {

	
	
	public static void main(String args[]) {
		
		Vehicle obj = new Vehicle();
		
		obj.vehiclecolor("Bus","Blue");
		
		speed("Bus","50");
		
		brandname("Bus","Volvo");
		
		
		
	}
	
	
	public static void busCapacity(int capacity) {
		
		System.out.println("This Bus is having " +capacity+" people");
	}
	
	

}
