package com.java8;

import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		boolean res=Stream.<String>of("mohan","ramu","ahi").parallel().isParallel();
		System.out.println(res);
	}
}
