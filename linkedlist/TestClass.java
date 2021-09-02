package com.linkedlist;

import java.util.Arrays;

public class TestClass {

	
	public static void main(String[] args) {
		System.out.println(13/5);
		System.out.println(13%5);

		System.out.println(3/5);
		System.out.println(3%5);
		
		String s1="abczdfanfadfteffd";
		char[] ch=s1.toCharArray();
		
		Arrays.sort(ch);
		
		for (char c : ch) {
			System.out.print(c+"\t");
		}
		
		int a,b,c;
		a=b=c=2;
		System.out.println(a+"=="+b+"=="+c);
	
	}
}
