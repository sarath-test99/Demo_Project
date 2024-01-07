package javaBasics.interfacesExample;

public class Dog implements Animals{

	
	@Override
	public void eat(String dogeat) {
		System.out.println("MyDog will eat");
		
	}
	
	@Override
	public void walk() {
		
		System.out.println("My DOG will walk");
	}
	
	
	@Override
	public void sleep() {
		
		System.out.println("my dog will sleep");
	}
	
	
	public static void main(String args[]) {
		
		Dog mydog = new Dog();
		
		mydog.eat("DOG food");
		mydog.walk();
		mydog.sleep();
		
	}

}
