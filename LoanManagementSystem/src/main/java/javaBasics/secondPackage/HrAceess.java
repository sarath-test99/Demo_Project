package javaBasics.secondPackage;

public class HrAceess {
	
	
	public static void main(String args[]) {
		
		EmployeeDetails empdetails = new EmployeeDetails();
		
		String empname = empdetails.employeename;
		String empDesg = empdetails.employeedesignation;
	//	int empID =	empdetails.employeeID;
	//	int empsal = empdetails.empsalary // private
		
		
		System.out.println("My Emp Name is " +empname);
		
		System.out.println("My Emp Designation is " +empDesg);
		
		empdetails.setEmpsalary(12345789);
		
		System.out.println("my Employee Salary is" +empdetails.getEmpsalary());
		
		
		
		
		empdetails.setEmployeeID(123);
		
		int EMPID = empdetails.getEmployeeID();
		
		System.out.println("My Employee ID is " +EMPID);
		
		
	}

}
