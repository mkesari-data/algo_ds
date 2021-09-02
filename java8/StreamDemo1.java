package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Predicate;

public class StreamDemo1 {

	public static void main(String[] args) {
		List<Employee> al=new ArrayList<Employee>();
		al.add(new Employee(100, "Mohan", 2000));
		al.add(new Employee(200, "avi", 3000));
		al.add(new Employee(300, "sasi", 3000));
		al.add(new Employee(50, "subhah", 2000));
		al.add(new Employee(60, "sankar", 8000));
		
		List<Employee> sortedList = al.stream()
		        .sorted( (Employee o1 ,Employee  o2) -> {
		        	if(o1.getSalary()==o2.getSalary())
		        	{
		        		return o1.getName().compareTo(o2.getName());
		        	}
		        	else if(o1.getSalary()<o2.getSalary())
		        		return -1;
		        		else return 0;
		        }
		        )
		       
		        .collect(Collectors.toList());

		sortedList.forEach(System.out::println);
		
	}
}
