package javaBasics.secondPackage;

public class EmployeeDetails {
	
	public static String employeename = "Qulaity";
	public static String employeedesignation = "Tester";
	private static int employeeID ;
	private int empsalary ;
	
	
	public int getEmpsalary() {
		
		return empsalary;
		
	}
	
	public void setEmpsalary(int empsal) {
		
		this.empsalary = empsal ;
		
	}
	
	public int getEmployeeID() {
		return employeeID;
	}
	
	public void setEmployeeID(int empID) {
		
		this.employeeID = empID;
	}
	

}
