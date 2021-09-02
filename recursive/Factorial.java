package com.recursive;

public class Factorial {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter Number to find Factorial Value:=>");
		int input = sc.nextInt();
		int result = factorial(input);
		System.out.println("Factorial Value is:=>" + result);

	}

	public static int factorial(int n) {
		int sol1, mySol;

		if (n == 0 /* the base cases */ ) {
			return 1; // The readily available solution for the base case
		} else {
			sol1 = factorial(n - 1); // Let "someone else" (= factorial(n-1) )
										// solve the smaller problem

			mySol = n * sol1; // Use the solution of the smaller problem
			// to solve my own problem

			return mySol; // Return my solution
		}
	}
}
