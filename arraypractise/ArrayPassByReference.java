package com.arraypractise;

public class ArrayPassByReference {

	 
	public static void main(String[] args) {
	
		
		int[] a= {10,12,13,45};
		int j=10;
		passArray(a,j);
		
		for (int i : a) {
			System.out.print(i+"\t");
		}
		System.out.println("Primitive Value:"+j);
	}
	
	static  void passArray(int[] a,int j) {
		a[0]=345;
		j=34;
	}
	
}
