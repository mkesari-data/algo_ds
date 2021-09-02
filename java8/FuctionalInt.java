package com.java8;

import java.util.function.Consumer;

@FunctionalInterface
public interface FuctionalInt  {
	
	int abstract_func(int x);
	

	default void default_Fun() {
		System.out.println("This is default method");
	}

}
