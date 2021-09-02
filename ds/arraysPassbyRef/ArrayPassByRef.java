package com.ds.arraysPassbyRef;

public class ArrayPassByRef {

	public static void main(String[] args) {
		int[] a= {1,2,3};
		modifyArray(a);
		
		for (int i : a) {
			System.out.print(i+"\t");
		}
	}
	
	static int[] modifyArray(int[] a) {
	   a[2]=45;
	   return a;
	}
}
