package com.recursive;

public class Palindrome {

	public static void main(String[] args) {
		int firstNumber=12321;
		System.out.println(palindrome(firstNumber,0));
	}
	
	static int palindrome(int first, int rev) {
		if(first==0) {
			return rev;
		}else {
			rev=rev*10+(first%10);
			first=first/10;
			rev=palindrome(first, rev);
		}
		return rev;
	}
}
