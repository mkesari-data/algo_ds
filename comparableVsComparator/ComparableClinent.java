package com.comparableVsComparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ComparableClinent {

	public static void main(String[] args) {
		List<Employee> al=new ArrayList<Employee>();
		al.add(new Employee(10,"Mohan",5000));
		al.add(new Employee(20,"Mohan2",7000));
		al.add(new Employee(30,"Mohan3",6000));
		al.add(new Employee(9,"Moha",2000));
		
		Collections.sort(al);
		for (Employee employee : al) {
			System.out.println(employee);
		}
		
	}
}
