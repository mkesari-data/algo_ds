package com.dp;

public class LongestCommonSubSequenceRecursive {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter First String");
		String firstString = sc.next();
		System.out.println("Enter Second String");
		String secondString = sc.next();

		int longestsubseqlength = findLCSLength(firstString.toCharArray(), secondString.toCharArray(),
				firstString.length(), secondString.length());
		System.out.println("Longest common subsequence length is:" + longestsubseqlength);
	}

	private static int findLCSLength(char[] firstString, char[] secondString, int firstLength, int secondLength) {

		/**
		 * Base condition if firstString or secondString length is zero , then return
		 * zero
		 */
		if (firstLength == 0 || secondLength == 0) {
			return 0;
		}

		/**
		 * 1. Compare Lat characters , if it matches -> call the same method by removing
		 * last character in both the arrays.
		 * 
		 */
		if (firstString[firstLength - 1] == secondString[secondLength - 1]) {
			int sol1 = findLCSLength(firstString, secondString, firstLength - 1, secondLength - 1);
			sol1 = sol1 + 1;
			return sol1;
		}
		/**
		 * 2. If last characters not match , then 2 cases.
		 * 
		 * 2.1 -> remove last character from first string and consider whole string in
		 * second string. 2.2 -> remove last character from second string and consider
		 * whole string in first string.
		 */

		int sol2 = findLCSLength(firstString, secondString, firstLength - 1, secondLength);
		int sol3 = findLCSLength(firstString, secondString, firstLength, secondLength - 1);

		if (sol2 > sol3) {
			return sol2;
		} else {
			return sol3;
		}

	}
}
