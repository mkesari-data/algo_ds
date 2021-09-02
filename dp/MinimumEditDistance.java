package com.dp;

public class MinimumEditDistance {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter First String");
		String firstString = sc.next();
		System.out.println("Enter Second String");
		String secondString = sc.next();

		int minEdits = findMinEditDistance(firstString.toCharArray(), secondString.toCharArray(), firstString.length(),
				secondString.length());
		System.out.println("Minimum changes required on First String is:" + minEdits);
	}

	
	
	private static int findMinEditDistance(char[] firstString, char[] secondString, int firstLength, int secondLength) {

		/**
		 * Base case 
		 */
		if(firstLength==0) {
			return secondLength;
		}
		if(secondLength==0) {
			return firstLength;
		}
		
		
		/**
		 * If last character matches , then resovle the n-1 , m-1 subproblem and add
		 * zero to the original result.
		 */

		if (firstString[firstLength - 1] == secondString[secondLength - 1]) {
			int sol1 = findMinEditDistance(firstString, secondString, firstLength - 1, secondLength - 1);
			return sol1;
		} else {
			/**
			 * if last charactes not match then are there 3 possible operations. 1. Delete
			 * last chracter in first string. [ (firstLength-1) , secondLegth ] 2.
			 * Substricute last character of second string in first String. [firstLength-1 ,
			 * secondLeght-1] 3. Insert last chracter of second string in first String.
			 * [firstLength , secondLegth-1]
			 * 
			 */

			int sol2 = findMinEditDistance(firstString, secondString, firstLength - 1, secondLength);
			int sol3 = findMinEditDistance(firstString, secondString, firstLength - 1, secondLength - 1);
			int sol4 = findMinEditDistance(firstString, secondString, firstLength, secondLength - 1);
			
			return Math.min(Math.min(sol2, sol3),sol4)+1;
			
		}

	}
}
