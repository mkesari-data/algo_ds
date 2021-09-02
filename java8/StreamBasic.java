package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamBasic {

	public static void main(String[] args) {
		
		
		System.out.println(Arrays.toString("ab+de".split("\\+")));
		List<String> names = new ArrayList<String>();
		names.add("Ajeet");
		names.add("Negan");
		names.add("Aditya");
		names.add("Steve");

		System.out.println("Number of elements are :" + names.stream().count());

		long finalCount = names.stream().filter(new Predicate<String>() {
			public boolean test(String s1) {
				return s1.startsWith("S");
			}
		}).count();
//		
		names.parallelStream().limit(100).forEach(System.out::println);

		long finalCount2 = names.stream().filter(s1 -> s1.startsWith("S")).count();

		System.out.println("Number of elements start with s :" + finalCount2);

	}

}
