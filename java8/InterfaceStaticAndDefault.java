package com.java8;

public interface InterfaceStaticAndDefault {
	
	static void test() {
		System.out.println("Static Method in Interace. ");
	}

	default void defaultMethod() {
		System.out.println("Default Method in Interace. ");
	}
	
	
	
}
