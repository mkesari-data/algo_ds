package com.clouddata.practise;

public class StringToIntegerArray {

	public static void main(String[] args) {
		String str="45678";
		int[] a=new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			a[i]=str.charAt(i)-48;
		}
		
		for (int i : a) {
			System.out.print(i+"\t");
		}
	}
}
