package javaBasics.inheritenceExample;

public class Car extends Vehicle{
	

	public static void main(String args[]) {
		
		
		Vehicle obj = new Vehicle();
		obj.vehiclecolor("Car","RED");
		speed("Car","100");
		brandname("Car","BENZ");
		
	}
	
	public static void carCapacity(int capacity) {
		
		System.out.println("This car is having " +capacity + "people cpacity");
	}
	

}
