package org.Encapsulation;

public class EmployeeInfo {

	// Binding the variable/data and method/code acting on the data together as a-
	// single unit is called Encapsulation

	// We are declaring the variables as private so that no one from outside the-
	// class can modify the type and name of these variables
	private int empId;
	private String empName;
	private String empEmailid;

	public static void main(String[] args) {
		EmployeeInfo emp = new EmployeeInfo();
		emp.setEmpId(1212);
		emp.setEmpName("Sivaganesh");
		emp.setEmpEmailid("sivag918@gmail.com");

		System.out.println("The Employee id is " + emp.getEmpId());
		System.out.println("The Employee name is " + emp.getEmpName());
		System.out.println("The Employee Email Id is " + emp.getEmpEmailid());
	}

	// we can modify our getters and setters according to our convenience i.e we can-
	// give only getters so that the outside class can only get the data
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmailid() {
		return empEmailid;
	}

	public void setEmpEmailid(String empEmailid) {
		this.empEmailid = empEmailid;
	}

}
