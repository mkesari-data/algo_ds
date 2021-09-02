package com.java.recursion;

import java.util.Scanner;

public class FactorialPractise {

	public static void main(String[] args) {
		System.out.println("Ener your Input");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int result=factorial(n);
		System.out.println(result);
	}
	
	/**
	 * n * (n-1) * (n-2) *******> 
	 * @param n
	 * @return
	 */
	private static int factorial(int n) {
		
		if(n==0 || n==1)
			return 1;
		else
			return n*factorial(n-1);
		
	}
	
}
