package com.recursive;

public class Fibonacci {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter Number to find Fibonacci Value:=>");
		int input = sc.nextInt();
		int result = fibonacci(input);
		System.out.println("Fibonacci Value is:=>" + result);
	}

	public static int fibonacci(int n) {

		/**
		 * ---------------------- Base Conditions **
		 */
		if (n == 0)
			return 1;
		else if (n == 1)
			return 1;
		else {
			int sol1 = fibonacci(n - 1);
			int sol2 = fibonacci(n - 2);
			int finalResult = sol1 + sol2;
			return finalResult;
		}
	}

	public static int fibonacci_v2(int n) {
		int sol1, sol2, solution; // Define variable...

		if (n == 0 /* the first base case */ ) {
			return 1; // The readily available solution for this base case
		} else if (n == 1 /* the second base case */ ) {
			return 1; // The readily available solution for this base case
		} else {
			sol1 = fibonacci(n - 1); // Hire "fibonacci" to solve first smaller problem
			sol2 = fibonacci(n - 2); // Hire "fibonacci" to solve second smaller problem

			solution = sol1 + sol2; // Use the solutions of the smaller problems
			// to solve my own problem

			return solution;
		}
	}
}
