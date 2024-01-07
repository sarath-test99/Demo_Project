package javaBasics.demo;

public class MethodParameters {
	
	
	public static void main(String args[]) {
		
	MethodParameters obj = new MethodParameters();
	
//	obj.myname("Sarath",20);
//	obj.myname("SADSA",21);
//	obj.myname("FSFAS",22);
//	obj.myname("JKJKS",23);
//	obj.myname("YUIHJ",24);
//	obj.myname("NJNJSND",25);
	
//	int z = AddInteger(10,20);
//	
//	double w = AddDouble(4.2, 5.2);
	
	
	int z = Addnumbers(10, 20);
	
	double w = Addnumbers(4.3, 5.3);
	
	System.out.println("int value" +z);
	
	System.out.println("double value" +w);
		
	}
	
	
	public static void myname(String firstname, int Age) {
		
		System.out.println(firstname + " " + Age);
		
		
	}
	
	public static int AddInteger(int x,int y) {
		
		
		return x+y;
		
		
	}
	
	public static double AddDouble(double x,double y) {
		
		
		return x+y;
		
		
	}
	
	
	public static int Addnumbers(int x,int y) {
		
		
		return x+y;
		
		
	}
	
	public static double Addnumbers(double x,double y) {
		
		
		return x+y;
		
		
	}
	
	
	
	

}
