package com.java.recursion;

import java.util.Scanner;

public class FibanocciSeries {

	public static void main(String[] args) {
		System.out.println("Ener your Input");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int result=fibanocci(n);
		System.out.println(result);
	}
	
	/**
	 * if n==0 => 0
	 * if n==1 => 1
	 * if n>1 => f(n-1) + f(n-2)
	 * @param n
	 * @return
	 */
	
	private static int fibanocci(int n) {
		if(n==0)
			return 0;
		else if (n==1)
			return 1;
		else {
			int sub1=fibanocci(n-1);
			int sub2=fibanocci(n-2);
			int result=sub1+sub2;
			return result;
		}
	}
}
