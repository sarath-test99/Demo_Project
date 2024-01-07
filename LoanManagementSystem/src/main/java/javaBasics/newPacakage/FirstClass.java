package javaBasics.newPacakage;

public class FirstClass {
	
	

	public static void main(String args[]) {
		
		
		System.out.println("This is my main method in First Class");
		
		SecondClass obj = new SecondClass();
		
		obj.firstmethod();
		
		SecondClass.secondmethod();
		
	//	SecondClass.thirdmethod(); // can not call private method from second class to firstclass
		
		SecondClass.fourthmethod();
		
		obj.fifthmethod();
		
		obj.sixthmethod();
		
		
		int xnum = obj.x ;
		
		System.out.println("x value in second class is = " +xnum);
		
		int staticxnum = SecondClass.z;
		
		System.out.println("x value in second class is = " +staticxnum);
		
	
		
		obj.x = 10 ;
		
		System.out.println("changed x value in FirstClass is = " +obj.x);
		
	
		
		int ynum = obj.y;
		
		System.out.println("y value in second class is = "+ynum);
		
		obj.y = 20;
		
		System.out.println("changed y value in FirstClass is = " +obj.y);
		
	
		
		
		
	}
	
	

}
