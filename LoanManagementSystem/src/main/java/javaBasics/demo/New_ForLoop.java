package javaBasics.demo;

public class New_ForLoop {

	public static void main(String args[]) {
		
		New_ForLoop obj = new New_ForLoop();
		
		obj.verifylogin();

	}
	
	
	public boolean verifylogin() {
		
		String username = "Qualityyyyyyyyyyy";
		String Password = "Thoughtyyyyyyyyy";

			

			if (username == "Quality" && Password == "Thought") {

				System.out.println("Username is correct please allow him");
				System.out.println("Password is correct please allow him");
				
			} 
			else {
				System.out.println("Username is not correct do not allow him");
				System.out.println("Password is not correct do not allow him");
			}
			return false;


	}
	
	
}
