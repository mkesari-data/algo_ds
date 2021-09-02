package com.java8;

public class FunctionalInterfaceClient {

	public static void main(String[] args) {

//		FuctionalInt f1=new FuctionalInt() {
//			
//			@Override
//			public void abstract_func(int x,int y) {
//				
//			}
//			
//		};
//		
//		f1.abstract_func(1, 2);

		java.util.ArrayList<Integer> a1 = new java.util.ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);

		FuctionalInt ff2 = (int x) -> {
			return x * x;
		};

		a1.forEach(x -> System.out.println(ff2.abstract_func(x)));

		a1.forEach(x -> System.out.println(ff2.abstract_func(x)));

		// System.out.println(ff2.abstract_func(10));

	}
}
