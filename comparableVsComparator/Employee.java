package com.comparableVsComparator;

public class Employee implements Comparable<Employee>{

	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	private int empId;
	private String empName;
	private double salary;
	
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public int compareTo(Employee e1) {
		if (this.salary == e1.salary)
			return 0;
		else if (this.salary > e1.salary)
			return 1;
		else
			return -1;
	}
	
	public String toString() {
		return ":EmpId:"+empId+":Name:"+empName+":Slary:"+salary;
	}
	
}
