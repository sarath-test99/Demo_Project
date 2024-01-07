package javaBasics.interfacesExample;

public class Cat implements Animals{
	
	@Override
	public void eat(String eat) {
		
		System.out.println("My Cat is eating food");
	}
	
	@Override
	public void sleep() {
		
		System.out.println("My CAt is sleeping at 10 pm");
	}
	
	@Override
	public void walk() {
		
		System.out.println("My Cat can walk 5 km in a day");
	}
	
	
	public static void main(String args[]) {
		
		Cat mycat = new Cat();
		
		mycat.eat("Cat food");
		mycat.walk();
		mycat.sleep();
	}

}
