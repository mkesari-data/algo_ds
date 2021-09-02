package com.ds.arraysPassbyRef;

public class RetrunArray {

	public static void main(String[] args) {
		
		int[] a=modifyArray();
		
		for (int i : a) {
			System.out.print(i+"\t");
		}
	}
	
	static int[] modifyArray() {
		int[] a= {1,2,3};
		return a;
	}
}
