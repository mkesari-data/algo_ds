package com.comparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ComparatorClient {

	public static void main(String[] args) {
		List<Emp> al=new ArrayList<Emp>();
		al.add(new Emp(10,"Mohan",5000));
		al.add(new Emp(20,"Mohan2",7000));
		al.add(new Emp(30,"Mohan3",6000));
		al.add(new Emp(9,"Moha",2000));
		
		Collections.sort(al,new EmpIdComparator());
		
		for (Emp emp : al) {
			System.out.println(emp);
		}
		
		Collections.sort(al,new EmpSalComparator());
			
			for (Emp emp : al) {
				System.out.println(emp);
			}
		
	}
	
}

class EmpIdComparator implements Comparator<Emp>{
	
	public int compare(Emp e1,Emp e2) {
		if(e1.getEmpId()==e2.getEmpId())
			return 0;
		else if(e1.getEmpId()>e2.getEmpId())
			return -1;
		else
			return 1;
		
	}
}

class EmpSalComparator implements Comparator<Emp>{
	
	public int compare(Emp e1,Emp e2) {
		if(e1.getSalary()==e2.getSalary())
			return 0;
		else if(e1.getSalary()>e2.getSalary())
			return -1;
		else
			return 1;
		
	}
}


class Emp {

	public Emp(int empId, String empName, double salary) {
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
	
	public String toString() {
		return ":EmpId:"+empId+":Name:"+empName+":Slary:"+salary;
	}
	
}
